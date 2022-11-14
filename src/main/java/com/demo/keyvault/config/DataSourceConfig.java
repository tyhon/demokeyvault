//package com.demo.keyvault.config;
//
////import com.azure.identity.ManagedIdentityCredential;
////import com.azure.identity.ManagedIdentityCredentialBuilder;
////import com.azure.security.keyvault.secrets.SecretClient;
////import com.azure.security.keyvault.secrets.SecretClientBuilder;
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
//
//    /**
//     * Authenticate with a managed identity.
//     */
////    public void createManagedIdentityCredential() {
////        ManagedIdentityCredential managedIdentityCredential = new ManagedIdentityCredentialBuilder()
////                .clientId("c8dc3c12-f485-475d-8aab-d27b941ea1a2") // only required for user assigned
////                .build();
////
////        // Azure SDK client builders accept the credential as a parameter
////        SecretClient client = new SecretClientBuilder()
////                .vaultUrl("https://demoazure.vault.azure.net")
////                .credential(managedIdentityCredential)
////                .buildClient();
////    }
//}
