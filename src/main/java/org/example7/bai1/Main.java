package org.example7.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        int check;
        do{
            System.out.println("===== MENU =====");
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem can bo theo ho ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Lua chon cua ban: ");
            check = sc.nextInt();
            sc.nextLine();
            switch (check) {
                case 1:
                    System.out.print("Nhap loai can bo (1: Cong nhan, 2: Ky su, 3: Nhan vien): ");
                    int loaiCanBo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();

                    System.out.print("Nhap tuoi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap gioi tinh: ");
                    String gender = sc.nextLine();

                    System.out.print("Nhap dia chi: ");
                    String address = sc.nextLine();

                    if (loaiCanBo == 1) {
                        System.out.print("Nhap bac: ");
                        int bac = sc.nextInt();
                        sc.nextLine();

                        CongNhan congNhan = new CongNhan(name, age, gender, address, bac);
                        qlcb.themCanBo(congNhan);
                    } else if (loaiCanBo == 2) {
                        System.out.print("Nhap nganh dao tao: ");
                        String branch = sc.nextLine();

                        KySu kySu = new KySu(name, age, gender, address, branch);
                        qlcb.themCanBo(kySu);
                    } else if (loaiCanBo == 3) {
                        System.out.print("Nhap cong viec: ");
                        String congViec = sc.nextLine();

                        NhanVien nhanVien = new NhanVien(name, age, gender, address, congViec);
                        qlcb.themCanBo(nhanVien);
                    } else {
                        System.out.println("Lua chon khong hop le.");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ho ten can tim kiem: ");
                    String timKiemTen = sc.nextLine();

                    ArrayList<CanBo> ketQuaTimKiem = qlcb.timKiemCanBo(timKiemTen);
                    if (ketQuaTimKiem.size() == 0) {
                        System.out.println("Khong tim thay can bo.");
                    } else {
                        System.out.println("Ket qua tim kiem:");
                        for (CanBo canBo : ketQuaTimKiem) {
                            System.out.println(canBo.getName() + " - " + canBo.getAge() + " - " + canBo.getGender() + " - " + canBo.getAddress());
                        }
                    }
                    break;
                case 3:
                    qlcb.hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        }while (check !=  4);

    }
}
