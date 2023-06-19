package org.example8.quanlynhansu.statis;

public enum TeacherLever {
    GS_TS("giao su tiến si"),
    PGS_TS("phó giao su tien si"),
    GIANG_VIEN_CHINH("Giảng Viên chính"),
    TS("Thạc sĩ");

    public String name;

    TeacherLever(String name) {
        this.name = name;
    }
}
