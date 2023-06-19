package org.example9.entity;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String phone;

    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void nhapThongTin(){
        System.out.println("Nhập tên: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = new Scanner(System.in).nextLine();
        System.out.println("Nhập số điện thoại: ");
        phone = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
