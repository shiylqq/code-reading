package org.shi.code.reading.main.pojo;


public class Person {
    private String name;

    private int age;

    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    /**
     * 如果auto-wire被明确设置为byType或byName就会自动注入容器中的对象
     * @param dog
     */
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
