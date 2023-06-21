package org.example10.entity;

import org.example10.statics.ReporterLever;

import java.util.Scanner;

public class Reporter extends Person{
    private static int AUTO_ID = 10000;
    private int id;
    private ReporterLever reporterLever;
    public Reporter(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public ReporterLever getReporterLever() {
        return reporterLever;
    }

    public void setReporterLever(ReporterLever reporterLever) {
        this.reporterLever = reporterLever;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", reporterLever=" + reporterLever +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void inputInfo(){
        super.inputInfo();
        System.out.println("Nhập trình độ: ");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2. Cộng tác viên");
        System.out.println("3. Nghiệp dư");
        int leverChoice;
        do {
            leverChoice = new Scanner(System.in).nextInt();
            if (leverChoice >= 1 && leverChoice <= 3) {
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        } while (true);
        switch (leverChoice){
            case 1:
                this.setReporterLever(ReporterLever.CN);
                break;
            case 2:
                this.setReporterLever(ReporterLever.CTV);
                break;
            case 3:
                this.setReporterLever(ReporterLever.ND);
                break;
        }
    }
}
