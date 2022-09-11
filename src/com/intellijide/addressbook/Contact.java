package com.intellijide.addressbook;

public class Contact {
    private String name;
    private int age;
    private String city;
    private String state;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
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
