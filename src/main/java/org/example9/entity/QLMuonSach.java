package org.example9.entity;

import java.util.Scanner;

public class QLMuonSach {
    private static BanDoc[] banDocArray = new BanDoc[100];
    private static Book[] bookArray = new Book[100];

    public void muonSach() {
        System.out.print("Nhập tên sách để mượn: ");
        String tenSachMuon = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên bạn cần mượn: ");
        String name = new Scanner(System.in).nextLine();
    }
}