package org.example6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int i, j, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();

        for ( i = 0; i < n; i++) {
            for (j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            k++;
            for ( j = 0; j <= i; j++) {
                k = k * (i - j) / (j + 1);
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
