package org.example11;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi 1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = new Scanner(System.in).nextLine();
        System.out.println("Nhập ví trí để thêm: ");
        int k = new Scanner(System.in).nextInt();
        StringBuilder str3 = new StringBuilder(str2);
        str3.insert(k, str1);
        System.out.println("Chuỗi sau khi thêm: " + str3);

    }
}
