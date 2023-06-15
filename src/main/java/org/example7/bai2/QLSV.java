package org.example7.bai2;


import java.util.Scanner;


public class QLSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check;
        do {
            System.out.println("Chuong trinh nhap xuat sinh vien");
            System.out.println("1. Them thong tin sinh vien mượn sách.");
            System.out.println("2. Xóa thông tin sinh vien bằng mã mượn.");
            System.out.println("3. Hiển thị thông tin sinh viên đã mượn sách.");
            System.out.println("4. Thoát");
            System.out.print("Bạn chọn: ");
            check = sc.nextInt();
            sc.nextLine();
            switch (check){
                case 1:
                    System.out.print("Nhập mã phiếu mượn: ");
                    String maPhieuMuon = sc.nextLine();
                    System.out.print("Ngày mượn: ");
                    int ngayMuon = sc.nextInt();
                    System.out.print("Ngày trả: ");
                    int ngayTra = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Số hiệu sách: ");
                    String soHieuSach = sc.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi sinh viên: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập lớp: ");
                    String lop = sc.nextLine();


                    SinhVien sv = new SinhVien(name, age, lop);
                    TheMuon theMuon = new TheMuon(maPhieuMuon, ngayMuon, ngayTra, soHieuSach,sv);
                    TheMuon.themTheMuon(theMuon);
                    break;

                case 2:
                    System.out.print("Nhap ma can xoa: ");
                    String xoa = sc.nextLine();
                    if(TheMuon.xoaTheMuon(xoa)){
                        System.out.println("Đã xóa, danh sách mới");
                        TheMuon.hienThiThongTinTheMuon();
                    }else{
                        System.out.println("Lỗi");
                    }
                    break;
                case 3:
                    System.out.println("danh sách:");
                    TheMuon.hienThiThongTinTheMuon();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        }while (check != 4);
    }
}
