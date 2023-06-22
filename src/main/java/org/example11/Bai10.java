package org.example11;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi 1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = new Scanner(System.in).nextLine();
        String result = str2.replaceAll(str1, "");
        System.out.println("Chuỗi sau khi được thay thế: " + result);
    }
}
