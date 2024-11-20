package com.wmsexpert.integracao.config.database;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

@Configuration
@EnableJpaRepositories(basePackages = {"com.wmsexpert.integracao.repository"})
@EntityScan( "com.wmsexpert.integracao.model")
public class DataSourceConfig {

    private static final String PATH_HOMOLOG = "datasource";

    @Bean
    @Profile({"db_dev"})
    public DataSource getDataSourceDev() throws IOException {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        BufferedReader br = new BufferedReader(new FileReader(PATH_HOMOLOG));
        dataSourceBuilder.driverClassName(br.readLine().replace("driveclass : ", ""));
        dataSourceBuilder.url(br.readLine().replace("url : ", ""));
        dataSourceBuilder.username(br.readLine().replace("username : ", ""));
        dataSourceBuilder.password(br.readLine().replace("password   : ", ""));
        return dataSourceBuilder.build();
    }

    @Bean
    @Profile({"db_prod"})
    public DataSource getDataSourceProd() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(System.getenv("DB_DRIVECLASS"));
        dataSourceBuilder.url(System.getenv("DB_URL"));
        dataSourceBuilder.username(System.getenv("DB_USERNAME"));
        dataSourceBuilder.password(System.getenv("DB_PASSWORD"));
        return dataSourceBuilder.build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        // Ajuste aqui para incluir todos os pacotes necessários
        em.setPackagesToScan(
                "com.wmsexpert.integracao.model",
                "com.wmsexpert.integracao.repository"
        );

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
        return transactionManager;
    }


}

