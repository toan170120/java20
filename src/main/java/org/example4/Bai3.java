package org.example4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.printf("\na[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0)
            {
                newArr[i] = arr[i] + 1;
            }
            else{
                newArr[i] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print("\t" + newArr[i]);
        }

    }
}
