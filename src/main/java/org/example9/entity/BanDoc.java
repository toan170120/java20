package org.example9.entity;

import org.example9.statics.LoaiBanDoc;

import java.util.Scanner;

public class BanDoc extends Person {
    private static int AUTO_MA = 10000;
    private int maBanDoc;
    private LoaiBanDoc loaiBanDoc;
    private static BanDoc[] arrayBanDoc = new BanDoc[100];

    public BanDoc(LoaiBanDoc loaiBanDoc, String name, String address, String phone) {
        super(name, address, phone);
        this.maBanDoc = AUTO_MA;
        AUTO_MA++;
        this.loaiBanDoc = loaiBanDoc;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

    public LoaiBanDoc getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(LoaiBanDoc loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    public void inputBanDoc() {
        System.out.println("Nhập danh sách bạn đọc mới");
        System.out.print("Nhập số lượng bạn đọc: ");
        int numberBanDoc = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberBanDoc; i++) {
            System.out.println("Bạn đọc " + (i + 1));
            BanDoc banDoc = new BanDoc(LoaiBanDoc.SINH_VIEN, "", "", "");
            banDoc.nhapThongTin();
            System.out.println("Chọn loại bạn đọc");
            System.out.println("1. SINH_VIEN");
            System.out.println("2. HOC_VIEN_CAO_HOC");
            System.out.println("3. GIAO_VIEN");
            int choiceBanDoc = new Scanner(System.in).nextInt();
            switch (choiceBanDoc) {
                case 1:
                    banDoc.setLoaiBanDoc(LoaiBanDoc.SINH_VIEN);
                    break;
                case 2:
                    banDoc.setLoaiBanDoc(LoaiBanDoc.HOC_VIEN_CAO_HOC);
                    break;
                case 3:
                    banDoc.setLoaiBanDoc(LoaiBanDoc.GIAO_VIEN);
                    break;
            }
            for (int j = 0; j < arrayBanDoc.length; j++) {
                if (arrayBanDoc[j] == null) {
                    arrayBanDoc[j] = banDoc;
                    break;
                }
            }
        }
        for (int i = 0; i < arrayBanDoc.length; i++) {
            if (arrayBanDoc[i] != null) {
                System.out.println(arrayBanDoc[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "maBanDoc=" + maBanDoc +
                ", loaiBanDoc=" + loaiBanDoc +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static BanDoc[] getArrayBanDoc() {
        return arrayBanDoc;
    }

    public static void setArrayBanDoc(BanDoc[] arrayBanDoc) {
        BanDoc.arrayBanDoc = arrayBanDoc;
    }
}