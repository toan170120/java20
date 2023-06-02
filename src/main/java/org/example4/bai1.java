package org.example4;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
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
        System.out.println(" Tông : " + sum);
    }
}
