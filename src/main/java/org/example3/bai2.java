package org.example3;

import java.util.Random;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int a;
        int random = rd.nextInt(1);
       do{
           System.out.printf("Nhập giá trị cần đoán: ");
           a = sc.nextInt();
           if( a > random){
               System.out.println("bạn đoán lớn hơn rồi, và cho nhập lại");
           } else if (a < random) {
               System.out.println("bạn đoán nhỏ hơn rồi, và cho nhập lại");
           }
           else {
               System.out.println("bạn đoán trúng rồi ");
           }
       }while (a != random);

    }
}
