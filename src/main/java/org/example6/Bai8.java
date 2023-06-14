package org.example6;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        System.out.print("Nhập giá trị b: ");
        int b = sc.nextInt();
        System.out.print("Nhập giá trị c: ");
        int c = sc.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= b && a[i] <= c) {
                sum += a[i];
                count++;
            }
        }
        double tB = (double) sum / count;

        System.out.printf("Trung bình cộng các phần tử trong đoạn %d và %c là %f: ", b, c, tB);
    }
}