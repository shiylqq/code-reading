package org.shi.code.reading.autoWired;

import org.shi.code.reading.autoWired.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiredMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();
        Object person = context.getBean("person");

        System.out.println(person);
    }
}
