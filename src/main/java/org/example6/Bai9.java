package org.example6;

import java.util.Scanner;

public class Bai9{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số hàng: ");
            int n = sc.nextInt();
            System.out.print("Nhập số cột: ");
            int m = sc.nextInt();

            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("a[%d][%d] = ", i, j);
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = arr[0][0];
            int min = arr[0][0];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    } else if (arr[i][j] < min) {
                        min = arr[i][j];
                    }
                }
            }

            System.out.println("Giá trị lớn nhất trong ma tran: " + max);
            System.out.println("Giá trị nhỏ nhất trong ma tran: " + min);
        }
}
