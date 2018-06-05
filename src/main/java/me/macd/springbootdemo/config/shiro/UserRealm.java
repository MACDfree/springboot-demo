package me.macd.springbootdemo.config.shiro;

import me.macd.springbootdemo.model.User;
import me.macd.springbootdemo.service.UserService;
import me.macd.springbootdemo.util.constants.Constants;
import me.macd.springbootdemo.util.constants.Status;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String loginName = (String) token.getPrincipal();
        User user = userService.findUserByUserName(loginName);
        if (user == null) {
            //没找到帐号
            throw new UnknownAccountException();
        }

        if (!Status.valid.getStatus().equals(user.getStatus())) {
            // 非有效用户
            throw new LockedAccountException();
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getUsername() + user.getSalt()), //salt=username+salt
                getName()
        );
        //session中不需要保存密码
        user.setPassword("");
        //将用户信息放入session中
        SecurityUtils.getSubject().getSession().setAttribute(Constants.SESSION_USER_INFO, user);
        return authenticationInfo;
    }
}
