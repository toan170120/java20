package org.example10.entity;

import java.util.Scanner;

public class Posts implements InputInfo {
    private static int AUTO_MA = 100;
    private int maBaiViet;
    private String nameBaiViet;
    private double price;
    public Posts(){
        this.maBaiViet = AUTO_MA;
        AUTO_MA++;
    }

    public static int getAutoMa() {
        return AUTO_MA;
    }

    public static void setAutoMa(int autoMa) {
        AUTO_MA = autoMa;
    }

    public int getMaBaiViet() {
        return maBaiViet;
    }

    public void setMaBaiViet(int maBaiViet) {
        this.maBaiViet = maBaiViet;
    }

    public String getNameBaiViet() {
        return nameBaiViet;
    }

    public void setNameBaiViet(String nameBaiViet) {
        this.nameBaiViet = nameBaiViet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "maBaiViet=" + maBaiViet +
                ", nameBaiViet='" + nameBaiViet + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void inputInfo(){
        System.out.print("Nhập tên kiểu bài: ");
        this.setNameBaiViet(new Scanner(System.in).nextLine());
        System.out.print("Nhập giá tiền: ");
        this.setPrice(new Scanner(System.in).nextDouble());
    }
}
