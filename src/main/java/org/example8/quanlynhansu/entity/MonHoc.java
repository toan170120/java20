package org.example8.quanlynhansu.entity;

public class MonHoc {
    private static int AUTO_MA = 100;
    private int maMonHoc;
    private String monHoc;
    private int tongSoTiet;
    private int soTietLyThuyet;
    private int mucKinhPhi;

    public MonHoc() {
        this.maMonHoc = AUTO_MA;
        AUTO_MA++;
    }

    public MonHoc(int maMonHoc, String monHoc, int tongSoTiet, int soTietLyThuyet, int mucKinhPhi) {
        this.maMonHoc = maMonHoc;
        this.monHoc = monHoc;
        this.tongSoTiet = tongSoTiet;
        this.soTietLyThuyet = soTietLyThuyet;
        this.mucKinhPhi = mucKinhPhi;
    }

    public static int getAutoMa() {
        return AUTO_MA;
    }

    public static void setAutoMa(int autoMa) {
        AUTO_MA = autoMa;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    public int getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(int mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMonHoc=" + maMonHoc +
                ", monHoc='" + monHoc + '\'' +
                ", tongSoTiet=" + tongSoTiet +
                ", soTietLyThuyet=" + soTietLyThuyet +
                ", mucKinhPhi=" + mucKinhPhi +
                '}';
    }
}
