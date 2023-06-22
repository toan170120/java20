package org.example11;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi 1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = new Scanner(System.in).nextLine();
        System.out.println(str2.indexOf(str1));
    }
}
