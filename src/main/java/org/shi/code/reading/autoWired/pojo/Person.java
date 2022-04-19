package org.shi.code.reading.autoWired.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Person {
    private String name;

    @Resource
    private Pen pen1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pen getPen1() {
        return pen1;
    }

    public void setPen1(Pen pen1) {
        this.pen1 = pen1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pen=" + pen1 +
                '}';
    }
}
