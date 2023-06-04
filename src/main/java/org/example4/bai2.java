package org.example4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        System.out.println("Bài 1: ");
//        fizzBuzz();
//        System.out.println("Bài 2: ");
//        xuatHienNhieu();
//        System.out.println("Bài 3: ");
//        veSao();
//        System.out.println("Bài 4: ");
//        veSaoRong();
        System.out.println("Bài 5: ");
        daoNguoc();
    }


// bài 1: Fizz and Buzz
    public static void fizzBuzz() {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("\tFizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("\tFizz");
            } else if (i % 5 == 0) {
                System.out.println("\tBuzz");
            } else {
                System.out.println("\t" + i);
            }
        }

    }

// Bài 2. Kiểm tra phần tử xuất hiện nhiều nhất

    public static void xuatHienNhieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự cần kiểm tra: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        int max = 0;
        char maxChar = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                maxChar = arr[i];
            }
        }
        System.out.println("\tKí tự xuất hiện nhiều nhất là: " + maxChar);
    }



//    bài 3. vẽ sao
    public static void veSao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a = ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b = ");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }


//    bài 4. vẽ sao rỗng

    public static void veSaoRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a = ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b = ");
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j ++){
                if (i < 1 || i >= b - 1 || j < 1 || j >= a - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

//    bài 5. Đảo ngược số
    public static void daoNguoc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a = ");
        int a = sc.nextInt();
        int b = 0;
        int du;
        while (a > 0){
            du = a % 10;
            if(du == 0){
                System.out.println("Không thể đảo ngược vì chứa đơn vị không");
                break;
            }
            b = b * 10 + du;
            a = a/ 10;
        }
        if(a == 0){
            System.out.println("Số đảo ngược là: " + b);
        }

    }

}
