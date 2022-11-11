//package com.demo.keyvault.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Value("spring-datasource-password")
//    private String datasourcePassword;
//    @Value("spring-datasource-username")
//    private String datasourceUsername;
////    @Value("spring-datasource-url")
//    private String datasourceUrl = "jdbc:postgresql://azuredemo.postgres.database.azure.com:5432/postgres";
//
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.url(datasourceUrl);
//        dataSourceBuilder.username(datasourceUsername);
//        dataSourceBuilder.password(datasourcePassword);
//        return dataSourceBuilder.build();
//    }
//}
