package org.example4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ: ");
        int hours = sc.nextInt();
        System.out.print("Nhập số phut: ");
        int second = sc.nextInt();
        System.out.print("Nhập số giay: ");
        int giay = sc.nextInt();

        double a = hours * 3600 + second * 60 + giay;
        double minutes = a / 60;
        double gio = minutes / 60;
        double day = gio / 24;
        double years = day / 365;

        day = day % 365;

        System.out.println((int)day + " ngày, " + (int)years + " năm");
    }
}
