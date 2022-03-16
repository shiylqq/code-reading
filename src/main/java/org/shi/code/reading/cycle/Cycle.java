package org.shi.code.reading.cycle;

import org.shi.code.reading.cycle.pojo.A;
import org.shi.code.reading.cycle.pojo.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:cycle.xml");

        A a = (A) ac.getBean("a");
        System.out.println(a.getName());
        B b = (B) ac.getBean("b");
        System.out.println(b.getName());
    }
}
