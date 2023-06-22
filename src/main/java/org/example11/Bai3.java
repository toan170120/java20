package org.example11;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập một xâu ký tự: ");
        String str = new Scanner(System.in).nextLine();
        String[] str2 = str.trim().split("\\s+");
        for (int i = 0; i < str2.length; i++) {
            str2[i] = capitalizeFirstLetter(str2[i]);
        }
        String capitalizedStr = String.join(" ", str2);
        System.out.println("Xâu ký tự sau khi chuyển ký tự đầu tiên của mỗi từ thành chữ hoa: " + capitalizedStr);
    }

    public static String capitalizeFirstLetter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
