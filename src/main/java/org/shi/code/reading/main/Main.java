package org.shi.code.reading.main;

import org.shi.code.reading.main.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:test.xml");

        Person person = (Person)context.getBean("person");

        System.out.println("person:"+ person.getName());
    }
}
