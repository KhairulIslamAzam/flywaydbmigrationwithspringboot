package com.example.flywaydemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Configuration
public class SecondDbConfig {
    @Bean(name = "seconddb")
    @ConfigurationProperties(prefix = "spring.db2.datasource")
    public DataSource dataSource() { return DataSourceBuilder.create().build();
    }
}
