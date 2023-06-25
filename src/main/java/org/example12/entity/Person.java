package org.example12.entity;

import java.util.Scanner;

public class Person implements InputInfo{
    protected String name;
    protected String addess;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addess='" + addess + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        System.out.print("Nhập tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAddess(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại: ");
        this.setPhone(new Scanner(System.in).nextLine());
    }
}
