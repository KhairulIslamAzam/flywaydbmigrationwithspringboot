package com.example.flywaydemo;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Configuration
public class FirstDbConfig {

    @Primary
    @Bean(name = "firstDb")
    @ConfigurationProperties(prefix = "spring.db1.datasource")
    @FlywayDataSource
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
