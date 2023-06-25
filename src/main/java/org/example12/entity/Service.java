package org.example12.entity;

import java.util.Scanner;

public class Service implements InputInfo{
    private static int AUTO_MA = 100;
    private int maDv;
    private String nameService;
    private int price;
    private String unit;


    public Service(){
        this.maDv = AUTO_MA;
        AUTO_MA++;
    }

    public static int getAutoMa() {
        return AUTO_MA;
    }

    public static void setAutoMa(int autoMa) {
        AUTO_MA = autoMa;
    }

    public int getMaDv() {
        return maDv;
    }

    public void setMaDv(int maDv) {
        this.maDv = maDv;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Service{" +
                "maDv=" + maDv +
                ", nameService='" + nameService + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        System.out.print("Nhập tên dịch vụ");
        this.setNameService(new Scanner(System.in).nextLine());
        System.out.print("Nhập giá tiền: ");
        this.setPrice(new Scanner(System.in).nextInt());
        System.out.print("Nhập đơn vị tính: ");
        this.setUnit(new Scanner(System.in).nextLine());
    }
}
