package org.example7.bai1;

import java.util.ArrayList;

public class QLCB{
    private ArrayList<CanBo> danhSach;

    public QLCB(){
        this.danhSach = new ArrayList<CanBo>();
    }
    public QLCB(ArrayList<CanBo> danhSach){
        this.danhSach = danhSach;
    }

    public void themCanBo(CanBo cb){
        this.danhSach.add(cb);
    }

    public ArrayList<CanBo> timKiemCanBo(String hoTen) {
        ArrayList<CanBo> ketQuaTimKiem = new ArrayList<>();
        for (CanBo canBo : danhSach) {
            if (canBo.getName().equalsIgnoreCase(hoTen)) {
                ketQuaTimKiem.add(canBo);
            }
        }
        return ketQuaTimKiem;
    }

    public void hienThiDanhSach() {
        if (danhSach.size() == 0) {
            System.out.println("không có danh sách.");
        } else {
            System.out.println("Danh sach can bo:");
            for (CanBo canBo : danhSach) {
                System.out.println(canBo.toString());
            }
        }
    }
}
