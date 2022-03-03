package org.shi.code.reading.componentTest;

import org.shi.code.reading.main.pojo.Dog;
import org.shi.code.reading.main.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiliang
 * @version 1.0
 * @date 2022/3/3
 **/
@Configuration
public class TestConfiguration {

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Person person() {
        this.dog();

        return new Person();
    }
}
