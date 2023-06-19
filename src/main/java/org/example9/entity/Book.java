package org.example9.entity;

import org.example9.statics.ChuyenNganh;

import java.util.Scanner;

public class Book {

    private static int AUTO_MA_SACH = 10000;
    private int maSach;
    private String tenSach;
    private String tacGia;
    private ChuyenNganh chuyenNganh;
    private int namSanXuat;
    private int soLuong;
    private static Book[] bookArray = new Book[100];

    public Book(){
        this.maSach = AUTO_MA_SACH;
        AUTO_MA_SACH++;
    }

    public Book(int maSach, String tenSach, String tacGia, ChuyenNganh chuyenNganh, int namSanXuat, int soLuongTon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.namSanXuat = namSanXuat;
        this.soLuong= soLuongTon;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void inputBook() {
        System.out.println("Nhập danh sách mới");
        System.out.print("Nhập số lượng sách bạn cần nhập: ");
        int numberBook = new Scanner(System.in).nextInt();
        for(int i = 0; i < numberBook; i++){
            Book book = new Book();
            System.out.println("Sách: " + (i + 1));
            System.out.print("Nhập tên sách: ");
            book.setTenSach(new Scanner(System.in).nextLine());
            System.out.print("Nhập tác giả: ");
            book.setTacGia(new Scanner(System.in).nextLine());
            System.out.println("Chọn chuyên ngành: ");
            System.out.println("1.KHTN");
            System.out.println("2.VHNT");
            System.out.println("3.DTVT");
            System.out.println("4.CNTT");
            int choiceBook = new Scanner(System.in).nextInt();
            switch (choiceBook){
                case 1:
                    book.setChuyenNganh(ChuyenNganh.KHTN);
                    break;
                case 2:
                    book.setChuyenNganh(ChuyenNganh.VHNT);
                    break;
                case 3:
                    book.setChuyenNganh(ChuyenNganh.DTVT);
                    break;
                case 4:
                    book.setChuyenNganh(ChuyenNganh.CNTT);
                    break;
            }
            System.out.print("Nhập năm sản xuất: ");
            book.setNamSanXuat(new Scanner(System.in).nextInt());
            System.out.print("Nhập số lượng: ");
            book.setSoLuong(new Scanner(System.in).nextInt());
            for(int j = 0; j < bookArray.length; j++){
                if(bookArray[j] == null){
                    bookArray[j] = book;
                    break;
                }
            }
        }
        for(int i = 0; i < bookArray.length; i++){
            if(bookArray[i] != null){
                System.out.println(bookArray[i]);
            }
        }
    }


    @Override
    public String toString() {
        return "Book{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", chuyenNganh=" + chuyenNganh +
                ", namSanXuat=" + namSanXuat +
                ", soLuong=" + soLuong +
                '}';
    }

    public static Book[] getBookArray() {
        return bookArray;
    }

    public static void setBookArray(Book[] bookArray) {
        Book.bookArray = bookArray;
    }
}
