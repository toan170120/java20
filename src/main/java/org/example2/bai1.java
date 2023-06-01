package org.example2;

import java.util.Random;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int c = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số tự nhiên a = ");
        int a = sc.nextInt();
        String b;
        b = (c == a) ? "đúng":"sai";
        System.out.println(b);

    }
}
