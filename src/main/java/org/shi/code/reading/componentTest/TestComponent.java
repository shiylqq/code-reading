package org.shi.code.reading.componentTest;

import org.shi.code.reading.main.pojo.Dog;
import org.shi.code.reading.main.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author shiliang
 * @version 1.0
 * @date 2022/3/3
 **/
@Component
public class TestComponent {

    @Bean
    public Dog dog(){
        Dog dog = new Dog();
        System.out.println( "1:" + ((Object) dog).toString());
        return dog;
    }


    @Bean
    public Person person(Person param){
        System.out.println("2:" + ((Object) param).toString());
//        this.dog();//@Component下的Bean不能通过调用方式依赖，因为这种方式不能保证单例
        return new Person();
    }
}
