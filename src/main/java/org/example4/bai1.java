package org.example4;

import java.util.Calendar;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        tongSo();
        timeLine();
    }
//bài 1
    public static void tongSo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương: ");
        int a = sc.nextInt();
        int sum = 0;
        String str = Integer.toString(a);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int b = Character.getNumericValue(c);
            sum += b;
        }
        System.out.println(" Tông các chữ số: " + sum);
    }

//bài 2
    public static void timeLine() {
        Scanner sc = new Scanner(System.in);
        int years;
        int day;

        // a. xử lý giờ
        System.out.print("Nhập vào số giờ: ");
        int hours = sc.nextInt();
        System.out.printf("ngày = %d và năm = %d \n", (hours / 24), (hours/8760)  );



        // b. xử lý phút
        System.out.print("Nhập vào số phút: ");
        int minute = sc.nextInt();
        System.out.printf("ngày = %d và năm = %d \n", (minute / 1440), (hours/525600)  );


       // c. xử lý giây

        System.out.print("Nhập vào số giây: ");
        int second = sc.nextInt();
        System.out.printf("ngày = %d và năm = %d \n", (second / 86400), (second/31622400)  );
        }

}
