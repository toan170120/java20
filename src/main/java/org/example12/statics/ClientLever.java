package org.example12.statics;

public enum ClientLever {
    CN("Cá Nhân"),
    DDDVHC("Đại diện đơn vị hành chính"),
    DDDVKD("Đại diện đơn vị kinh doanh");
    public String name;

    ClientLever(String name) {
        this.name = name;
    }
}
