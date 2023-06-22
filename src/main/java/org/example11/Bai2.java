package org.example11;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập chuôỗi cần xử lý: ");
        String n = new Scanner(System.in).nextLine();
        String nStr = "";
        for (int i = 0; i < n.length(); i++) {
            if(i % 2 == 0){
                nStr+=n.charAt(i);
            }else{
                nStr+=n.toUpperCase().charAt(i);
            }
        }
        System.out.println(nStr);
    }
}
