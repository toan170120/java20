package org.example9.main;

import org.example9.entity.BanDoc;
import org.example9.entity.Book;

import java.util.Scanner;

public class Main {
    public static BanDoc[] arrayBanDoc;
    public static Book[] arrayBook;

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        while (true){
            System.out.println("----------------menu---------------");
            System.out.println("1. Nhập danh sách sach mới và in ra");
            System.out.println("2. Nhập danh sách bạn đọc mới và in ra");
            System.out.println("3. Quản lý mượn sách và in ra");
            System.out.println("4. Sắp xếp theo tên");
            System.out.println("5. Tìm kiếm tên bạn đọc và in ra thông tin");
            System.out.println("6. Thoát");
            System.out.print("Bạn chọn: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    Book book = new Book();
                    book.inputBook();
                    break;
                case 2:
                    BanDoc banDoc = new BanDoc(null, null, null, null);
                    banDoc.inputBanDoc();
                    break;
                case 3:

                    break;
                case 6:
                    return;
            }
        }
    }
}
