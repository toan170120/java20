package org.example2;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn cần gì ? ");
        System.out.println("\t1. Phuong trình bậc nhất. ");
        System.out.println("\t2. Phương trình bậc 2.");
        System.out.println("\t3. Chu vi diện tích chữ nhật. ");
        System.out.println("\t4. Tính tuổi. ");
        System.out.println("\t5. Xử lý chuỗi. ");
        System.out.print("Bạn chọn: ");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("----------------------");
                System.out.println("\t Giải phương trình bậc nhất");
                giaiPhuongTrinh1();
                break;
            case 2:
                System.out.println("----------------------");
                System.out.println("\t Giải phương trình bậc hai");
                giaiPhuongTrinh2();
                break;
            case 3:
                System.out.println("----------------------");
                System.out.println("\t Hình chữ nhật");
                hinhChuNhat();
                break;
            case 4:
                System.out.println("----------------------");
                System.out.println("\t Tính tuổi");
                tinhTuoi();
                break;
            case 5:
                System.out.println("\txử lý chuỗi: ");
                xuLyChuoi();
                break;
        }



    }
    //        giải phương trình bậc nhất
    public static void giaiPhuongTrinh1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số: ");
        System.out.print("Nhập a = ");
        float a = sc.nextFloat();
        System.out.print("Nhập b = ");
        float b = sc.nextFloat();
        if(a == 0){
            System.out.println("Phương trình vô nghiệm");
        }else{
            System.out.println("Phuong trinh có nghiệm x = " + (-b / a));
        }
    }

//    Giải phương trình bâc 2
    public static void giaiPhuongTrinh2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số: ");
        System.out.print("Nhập a = ");
        float a = sc.nextFloat();
        System.out.print("Nhập b = ");
        float b = sc.nextFloat();
        System.out.print("Nhập c = ");
        float c = sc.nextFloat();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh sai");
            }else{
                System.out.println("Phuong trình có nghiệm x = " + (-c / b));
            }
        }else{
            float delta = b * b - 4 * a * c;
            float x1;
            float x2;
            if(delta > 0){
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.printf("Phương trình có 2 nghiệm x1 = %f , x2 = %f", x1, x2 );
            }
            else if (delta == 0){
                x1 = (-b / (2 * a));
                System.out.printf("Phuong trình có nghiệm duy nhất x = %f", x1);
            }
            else{
                System.out.println("Phuong trình vo nghiệm");
            }
        }
    }
//thông tin hình chữ nhật
    public static void hinhChuNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài: ");
        System.out.print("Nhập cạnh a = ");
        float a = sc.nextFloat();
        System.out.print("Nhập cạnh b = ");
        float b = sc.nextFloat();
        System.out.println("Chu vi hình chữ nhật là: " + ((a+b)*2));
        System.out.println("diện thích hình chữ nhật là: " + (a*b));
    }
//tính tuôi
    public static void tinhTuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn: ");
        double oll = sc.nextDouble();
        LocalDate year = LocalDate.now();
        double a = year.getYear() - oll;
        System.out.println("Tuổi hiện tại của bạn: " + a);

    }

    public static void xuLyChuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Nhập kí tự: ");
        String a = sc.nextLine();
        char c = a.charAt(0);
        System.out.println(str.indexOf(c));
        System.out.println(str.lastIndexOf(c));
        System.out.println("Thay thế chuỗi: ");
        System.out.println("Nhập chuỗi 1: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = sc.nextLine();
        System.out.println("Nhập chuỗi 3: ");
        String str3 = sc.nextLine();
        System.out.println("Chuỗi mới khi bị thay thế: " + str1.replace(str2, str3));

    }
}

