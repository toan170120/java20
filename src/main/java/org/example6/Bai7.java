package org.example6;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        do {
            for (int i = 0; i < n; i++) {
                System.out.printf("arr[%d] = ", i);
                arr[i] = sc.nextInt();
            }
        } while (!kiemTraTrung(arr, n));
    }

    public static boolean kiemTraTrung(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}