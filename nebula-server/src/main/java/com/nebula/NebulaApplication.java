package com.nebula;

import com.nebula.config.TaskThreadPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableConfigurationProperties({TaskThreadPoolConfig.class} )
public class NebulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NebulaApplication.class, args);
    }

}
