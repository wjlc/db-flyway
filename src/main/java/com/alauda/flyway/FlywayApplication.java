package com.alauda.flyway;

import com.alauda.flyway.config.ApplicationProperties;
import com.alauda.flyway.config.DefaultProfileUtil;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.Location;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan
@EnableConfigurationProperties({ApplicationProperties.class})
public class FlywayApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(FlywayApplication.class);
        DefaultProfileUtil.addDefaultProfile(app);
        Environment env = app.run(args).getEnvironment();

        //*********************************************************************


        ClassicConfiguration configuration = new ClassicConfiguration();

        configuration.setDataSource(env.getProperty("flywayutil.source1.url"), env.getProperty("flywayutil.source1.username"), env.getProperty("flywayutil.source1.password"));
        configuration.setLocations(new Location("db1/migration/"));
        configuration.setSchemas("history");
        Flyway flyway = new Flyway(configuration);

        flyway.migrate();

        //*********************************************************************

        configuration.setDataSource(env.getProperty("flywayutil.source2.url"), env.getProperty("flywayutil.source2.username"), env.getProperty("flywayutil.source2.password"));
        configuration.setLocations(new Location("db2/migration/"));
        configuration.setSchemas("history");
        flyway = new Flyway(configuration);

        flyway.migrate();
    }
}
