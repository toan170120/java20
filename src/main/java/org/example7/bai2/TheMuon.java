package org.example7.bai2;

import java.util.ArrayList;

public class TheMuon{
    private String maPhieuMuon;
    private int ngayMuon;
    private int ngayTra;
    private String soHieuSach;
    private SinhVien thongTinSinhvien;

    private static ArrayList<TheMuon> danhSach = new ArrayList<>();
    public TheMuon(String maPhieuMuon, int ngayMuon, int ngayTra, String soHieuSach, SinhVien thongTinSinhvien) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
        this.thongTinSinhvien = thongTinSinhvien;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getThongTinSinhvien() {
        return thongTinSinhvien;
    }

    public void setThongTinSinhvien(SinhVien thongTinSinhvien) {
        this.thongTinSinhvien = thongTinSinhvien;
    }

    public static void themTheMuon(TheMuon theMuon) {
        danhSach.add(theMuon);
    }

    public static boolean xoaTheMuon(String maPhieuMuon) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaPhieuMuon().equals(maPhieuMuon)) {
                danhSach.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void hienThiThongTinTheMuon() {
        if (danhSach.size() == 0) {
            System.out.println("không có danh sách.");
        } else {
            for (TheMuon theMuon : danhSach) {
                System.out.println("-Mã phiếu mượn: " + theMuon.getMaPhieuMuon() + "-Ngày mượn: " + theMuon.getNgayMuon() + "-Hạn trả: " + theMuon.getNgayTra() + "-Số hiệu sách: " + theMuon.getSoHieuSach());
                System.out.println("Thông tin sinh viên mượn sách:");
                System.out.println("- Họ tên: " + theMuon.getThongTinSinhvien().getName() + "- Tuổi: " + theMuon.getThongTinSinhvien().getAge() + "- Lớp: " + theMuon.getThongTinSinhvien().getLop());
                System.out.println();
            }
        }

    }


}
