package com.intellijide.addressbook;

public class Contact {
    private String name;
    private int age;
    private String city;
    private String state;

    public Contact(String name, int age, String city, String state) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
