package me.macd.springbootdemo.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

//@Configuration
public class SessionFactoryConfiguration {

//    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setTypeAliases(entityPackage);
//        return sqlSessionFactoryBean;
//    }
}
