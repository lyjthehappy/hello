package org.example.config;


import org.example.DemoDodule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnProperty(prefix = "lyj",name = "version")
public class Config {


    @Bean
    public DemoDodule demoDodule(DemoProperties demoProperties) {
        DemoDodule demoDodule = new DemoDodule();

        demoDodule.setName(demoProperties.getName());
        demoDodule.setVersion(demoProperties.getVersion());
        return demoDodule;

    }


}
