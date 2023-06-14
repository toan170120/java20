package org.example7.bai1;

class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String name, int age, String gender, String address, String congViec) {
        super(name, age, gender, address);
        this.congViec = congViec;
    }
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String toString() {
        return super.toString() + ", Công việc: " + congViec;
    }
}
