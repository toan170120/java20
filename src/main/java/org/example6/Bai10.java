package org.example6;

public class Bai10 {
    public static void main(String[] args) {
        int a = 10;
        int dem = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                dem++;
            }
        if(dem > 0){
            System.out.println("không phai so nguyen to");
        }
    }}}
