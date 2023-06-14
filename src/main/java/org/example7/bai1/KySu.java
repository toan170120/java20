package org.example7.bai1;

public class KySu extends CanBo{
    private String branch;
    public KySu(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }
    public String getBac() {
        return branch;
    }

    public void setBac(int bac) {
        this.branch = branch;
    }

    public String toString() {
        return super.toString() + ", Ngành đào tạo: " + branch;
    }


}
