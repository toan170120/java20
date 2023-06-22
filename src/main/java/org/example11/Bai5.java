package org.example11;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần xử lý: ");
        String str = new Scanner(System.in).nextLine();
        String[] word = str.split(" ");
        String words = word[word.length - 1];
        for (int i = 1; i < word.length - 1; i++) {
            words += " " + word[i];
        }
        words += " " + word[0];
        System.out.println(words);
    }
}
