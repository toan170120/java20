package org.example6;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng mạng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        //duyệt mảng
        int count = 0;
        int b = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] == b) {
                count++;
            } else {
                if (count > 0) {
                    System.out.printf("Giá trị %d trùng lặp liên tiếp %d lần.\n", b, count + 1);
                    count = 0;
                }
                b = a[i];
            }
        }

        if (count > 0) {
            System.out.printf("Giá trị %d trùng lặp liên tiếp %d lần.\n", b, count + 1);
        } else {
            System.out.println("Không có giá trị trùng lặp liên tiếp.");
        }
    }


}