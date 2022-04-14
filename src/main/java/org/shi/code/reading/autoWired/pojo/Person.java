package org.shi.code.reading.autoWired.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;

    @Autowired
    private Pen pen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pen=" + pen +
                '}';
    }
}
