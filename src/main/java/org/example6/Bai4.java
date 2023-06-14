package org.example6;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ma trận m1 = ");
        int m1 = sc.nextInt();
        System.out.print("Nhập ma trận n1 = ");
        int n1 = sc.nextInt();
        int[][] arr1 = new int[m1][n1];

        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                arr1[i][j] = sc.nextInt();
            }
        }
        //in ma trận;
        for(int i = 0; i < m1; i++){
            for(int j = 0; j <n1; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.print("Nhập ma trận m2 = ");
        int m2 = sc.nextInt();
        System.out.print("Nhập ma trận n2 = ");
        int n2 = sc.nextInt();
        int[][] arr2 = new int[m2][n2];

        for(int i = 0; i < m2; i++){
            for(int j = 0; j < n2; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m2; i++){
            for(int j = 0; j <n2; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        //Nhân 2 ma trận
        int[][] arr3 = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < n1; k++) {
                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        //Hiển thị ma trận.
        System.out.println("Ma trận tích C: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
