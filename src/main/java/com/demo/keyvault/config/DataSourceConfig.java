package com.demo.keyvault.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://azuredemo.postgres.database.azure.com:5432/postgres");
        dataSourceBuilder.username("cluong");
        dataSourceBuilder.password("Password@Azure");
        return dataSourceBuilder.build();
    }
}
