package org.example11;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần xử lý: ");
        String str = new Scanner(System.in).nextLine();
        String[] word = str.split(" ");
        String longestWord = "";
        int maxLength = 0;
        String maxStr = "";
        for (int i = 0; i < word.length; i++) {
            int length = word[i].length();
            if (length > maxLength) {
                maxLength = length;
                maxStr = word[i];
            }
        }
        System.out.println("Từ có độ dài dài nhất: " + maxStr);
    }
}
