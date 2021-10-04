package com.company;

public class StudentRecode implements Prototype {

    private final int id;
    private final String name;
    private final String address;
    private final int age;

    public StudentRecode(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void showRecode() {
        System.out.println("Id: " + id + "\t" + "Name: " + name + "\t" + "Address: " + address + "\t" + "Age: " + age);
    }

    @Override
    public Prototype getClone() {
        return new StudentRecode(id, name, address, age);
    }
}
