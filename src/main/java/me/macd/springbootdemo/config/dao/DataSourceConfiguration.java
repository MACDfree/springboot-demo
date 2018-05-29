package me.macd.springbootdemo.config.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

//@Configuration
//@MapperScan("me.macd.springbootdemo.dao")
public class DataSourceConfiguration {
//    @Value("${spring.datasource.driver-class-name}")
//    private String jdbcDriver;
//    @Value("${spring.datasource.url}")
//    private String jdbcUrl;
//    @Value("${spring.datasource.username}")
//    private String jdbcUsername;
//    @Value("${spring.datasource.password}")
//    private String jdbcPassword;
//
//    @Bean(name = "dataSource")
//    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(jdbcDriver);
//        dataSource.setJdbcUrl(jdbcUrl);
//        dataSource.setUser(jdbcUsername);
//        dataSource.setPassword(jdbcPassword);
//        // 关闭连接后不自动提交
//        dataSource.setAutoCommitOnClose(false);
//        return dataSource;
//    }
}
