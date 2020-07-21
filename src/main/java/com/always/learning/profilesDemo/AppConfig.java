package com.always.learning.profilesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig
{
    @Autowired
    private EnvDetails envDetails;

    @Bean
    @Profile("dev")
    public EnvDetails devEnv()
    {
        System.out.println("Dev Environments Stuff ....");
        System.out.println(envDetails);
        return envDetails;
    }

    @Bean
    @Profile("test")
    public EnvDetails testEnv()
    {
        System.out.println("Test Environments Stuff ....");
        System.out.println(envDetails);
        return envDetails;
    }

    @Bean
    @Profile("prod")
    public EnvDetails prodEnv()
    {
        System.out.println("Prod Environments Stuff ....");
        System.out.println(envDetails);
        return envDetails;
    }
}
