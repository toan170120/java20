package org.example2;

import java.util.Scanner;

public class phuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hằng số: ");
        System.out.printf("\ta = ");
        float a = scanner.nextFloat();
        System.out.printf("\tb = ");
        float b = scanner.nextFloat();
        System.out.printf("\tc = ");
        float c = scanner.nextFloat();
        giaiPT(a, b, c);
    }

    public static void giaiPT(float a, float b, float c) {
        if(a == 0){
            if(b == 0)
            {
                System.out.println("Phương trình vô nghiệm");
            }
            else{
                System.out.println("Phương trình có nghiệm x = " + (-c/b));
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
}
