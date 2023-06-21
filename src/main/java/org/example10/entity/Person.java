package org.example10.entity;

import java.util.Scanner;

public class Person implements InputInfo{
    protected String name;
    protected String address;
    protected String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    @Override
    public void inputInfo() {
        System.out.println("Nhập tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập SDT: ");
        this.setPhoneNumber(new Scanner(System.in).nextLine());
    }

}
