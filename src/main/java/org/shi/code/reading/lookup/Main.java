package org.shi.code.reading.lookup;

import org.shi.code.reading.lookup.pojo.FruitPlate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lookup.xml");
        FruitPlate fruitPlate = (FruitPlate) ac.getBean("fruitPlate");

        System.out.println(fruitPlate);
        System.out.println(fruitPlate.getFruit());

    }
}
