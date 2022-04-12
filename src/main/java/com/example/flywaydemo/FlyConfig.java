package com.example.flywaydemo;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Configuration
public class FlyConfig {
    private final DataSource dataSource;

    public FlyConfig(@Qualifier("seconddb") DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void runMigration() {
        Flyway.configure()
                .dataSource(dataSource)
                .locations("test/mysql")
                .baselineOnMigrate(true)
                .load()
                .migrate();
    }
}
