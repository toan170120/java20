package org.example7.bai1;

public class CongNhan extends CanBo{
    private int bac;
    public CongNhan(String name, int age, String gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public String toString() {
        return super.toString() + ", Bậc: " + bac;
    }
}
