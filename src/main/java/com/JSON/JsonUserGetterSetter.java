package com.JSON;

public class JsonUserGetterSetter {
    private String firstName;
    private String lastName;
    private Integer age;
    private AddressGetterSetter address;


    public JsonUserGetterSetter(String firstName, String lastName, Integer age, AddressGetterSetter address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AddressGetterSetter getAddress() {
        return address;
    }

    public void setAddress(AddressGetterSetter address) {
        this.address = address;
    }
}
