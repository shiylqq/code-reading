package org.shi.code.reading.instanceSupplier.pojo;

public class Tu {
    private String name;

    private String husband;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Tu{" +
                "name='" + name + '\'' +
                ", hasband='" + husband + '\'' +
                '}';
    }
}
