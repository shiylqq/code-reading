package org.shi.code.reading.main.config;

import org.shi.code.reading.main.pojo.Man;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class baseConfig {

    @Bean
    public Man man(){
        Man man = new Man();
        man.setJj(true);
        return man;
    }

}
