package org.shi.code.reading.cycle.pojo;

public class C implements CInterface{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }
}
