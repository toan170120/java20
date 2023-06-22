package org.example11;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (soThuanNghich(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean soThuanNghich(int n){
        String str1 = new StringBuilder(String.valueOf(n)).reverse().toString();
        return String.valueOf(n).equals(str1);
    }
}
