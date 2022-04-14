package org.shi.code.reading.autoWired.config;

import org.shi.code.reading.autoWired.pojo.Pen;
import org.shi.code.reading.autoWired.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Pen pen(){
        Pen pen = new Pen();
        pen.setColor("black");
        return pen;
    }

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("sliang");
        return person;
    }


}
