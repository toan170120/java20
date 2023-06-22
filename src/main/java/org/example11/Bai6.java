package org.example11;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        String regex = "^(\\w{1,10}\\s){0,19}\\w{1,10}$";
        String str;
        do {
            System.out.println("Nhập đoạn không quá 20 từ và 1 từ không quá 10 kí tự: ");
            str = new Scanner(System.in).nextLine();
        } while (str.matches(regex));

        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) < 0) {
                    String tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
