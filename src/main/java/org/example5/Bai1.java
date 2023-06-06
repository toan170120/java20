package org.example5;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        sumArr();
        kiemTraLap();
        addArr();
        tinhTbc();
        veSao();
    }


//    Bài 1: giá trị trung bình các giá trị trong mảng không chứa max và min
    public static void sumArr() {
        Scanner sc = new Scanner(System.in);

        //Nhập mảng
        System.out.print("Nhập số lượng phần tử mảng = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;  i < n; i++){
            System.out.printf("\ta[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        //sắp xếp mảng
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] < arr[j]){
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }

        //in và tính trung bình khong chứa max-min
        float sum = 0;
        for(int i = 1; i < n - 1; i++){
            sum += arr[i];
        }
        System.out.println("Trung bình của mảng không chứa giá trị lớn nhất và nhỏ nhất là: " + (sum/(n - 2)));
    }




    //Bài 2: Kiểm tra trùng lặp

    public static void kiemTraLap() {
        String[] arr1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] arr2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }


    //Bài 3. Thêm giá trị vào mảng.
    public static void addArr() {
        Scanner sc = new Scanner(System.in);
        //nhập mảng
        System.out.print("Nhập số lượng phần tử mảng = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;  i < n; i++){
            System.out.printf("\ta[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        //Them phần tử
        int[] newArr = new int[n + 1];
        System.out.print("Nhập giá trị cần chèn: ");
        int a = sc.nextInt();
        System.out.print("Nhâp vị trí cần chèn: ");
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                newArr[i] = arr[i];
            } else {
                newArr[i+1] = arr[i];
            }
        }
        newArr[k] = a;


        //xuất
        for(int i = 0; i < n+ 1; i++){
            System.out.print("\t" + newArr[i]);
        }
    }



    //Bài 4. Tính trung bình cộng
    public static void tinhTbc() {
        Scanner sc = new Scanner(System.in);
        //nhập mảng
        System.out.print("Nhập số lượng phần tử mảng = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;  i < n; i++){
            System.out.printf("\ta[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        //tinh trung binh cộng
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println("Giá trị trung bình của mảng: " + (double)(sum/n));
    }

    //Bài 5. Vẽ hình chữ nhật

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

}
