package org.example11;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi 1: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = new Scanner(System.in).nextLine();
        if(str1.contains(str2)){
            str1 = str1.replaceAll(str2, "");
        }
        System.out.println("Chuỗi sáu khi thay thế: "+ str1);
    }
}
