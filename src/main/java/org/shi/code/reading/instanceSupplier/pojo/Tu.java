package org.shi.code.reading.instanceSupplier.pojo;

public class Tu {
    private String name;

    private String hasband;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHasband() {
        return hasband;
    }

    public void setHasband(String hasband) {
        this.hasband = hasband;
    }

    @Override
    public String toString() {
        return "Tu{" +
                "name='" + name + '\'' +
                ", hasband='" + hasband + '\'' +
                '}';
    }
}
