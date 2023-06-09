package org.example6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        tamGiacVuong();
        tamGiacVuongLap();
        tamGiacVuong1();
        tamGiacGoc();
        tamGiacPascal();
    }


    //Bài 1. In ra tam giác vuông
    public static void tamGiacVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Bài 2: In ra tam giác vuông lặp lại

    public static void tamGiacVuongLap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


    //Bài 3 + 4: Cộng thêm 1 vào tam giác vuông
    // em thấy giống nhau nên làm 1 bài ạ
    public static void tamGiacVuong1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        int a = sc.nextInt();
        int dem = 1;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print(dem +"\t");
                dem++;
            }
            System.out.println();
        }
    }
    //Bài 4: in sang bên phải
    public static void tamGiacGoc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }


    // Bài 5 Tam giác pascal
    public static void tamGiacPascal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        int a = sc.nextInt();
            int[][] pascal = new int[100][100];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        pascal[i][j] = 1;
                    } else {
                        pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                    }
                }
            }
//            for (int i = 0; i < a; i++) {
//                for (int j = 0; j <= i; j++) {
//                    System.out.print(pascal[i][j] + " ");
//                }
//                System.out.println();
//            }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if (pascal[i][j] != 0) {
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();
        }

        }
}


