package org.shi.code.reading.main;

import org.shi.code.reading.main.config.UserFactoryBean;
import org.shi.code.reading.main.pojo.Man;
import org.shi.code.reading.main.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:test.xml");

        Person person = (Person)context.getBean("person");

        System.out.println("person:" + person.toString());


        //获取factoryBean实例
        UserFactoryBean factoryBean = context.getBean(UserFactoryBean.class);
        System.out.println("factoryBean get by Type:" +  factoryBean);

        Object bean1 = context.getBean("userFactoryBean");
        System.out.println("factoryBean get by name:" + bean1);

        Object bean2 = context.getBean("&userFactoryBean");
        System.out.println("factoryBean get by name with &:" + bean2);

        Man man = (Man) context.getBean("man");
//
        System.out.println(man);
    }
}
