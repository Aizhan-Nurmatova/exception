package com.company;

public class Student {
    private String name;
    private int age;
    private String group;
    private int batch;

    public Student(String name, int age, String group, int batch) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age <= 15) {
            System.out.print( age + " ");
            throw new InvalidAgeException();
        }
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", batch=" + batch +
                '}';
    }
}
