package org.example9.statics;

public enum ChuyenNganh {
    KHTN("Khoa học tự nhiên"),
    VHNT("Văn học nghệ thuật"),
    DTVT("Điện tử viễn thông"),
    CNTT("Công nghệ thông tin");

    public String name;

    ChuyenNganh(String name) {
        this.name = name;
    }
}