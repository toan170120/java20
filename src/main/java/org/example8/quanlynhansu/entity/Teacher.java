package org.example8.quanlynhansu.entity;

import org.example8.quanlynhansu.statis.TeacherLever;

public class Teacher extends Person{

    private static int AUTO_ID = 100;
    private int id;
    private TeacherLever lever;

    public Teacher() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeacherLever getLever() {
        return lever;
    }

    public void setLever(TeacherLever lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", lever=" + lever +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
