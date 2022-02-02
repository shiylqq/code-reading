package org.shi.code.reading.instantiationAware;

import org.shi.code.reading.instantiationAware.pojo.Cup;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:instantiationAware.xml");
        Cup cup = ac.getBean(Cup.class);
        System.out.println(cup);
    }
}
