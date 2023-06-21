package org.example8.quanlynhansu.main;

import org.example8.quanlynhansu.entity.MonHoc;
import org.example8.quanlynhansu.entity.Teacher;
import org.example8.quanlynhansu.statis.TeacherLever;

import java.util.Scanner;

public class Main {
    private static Teacher[] teachers = new Teacher[100];
    private static MonHoc[] monHocs = new MonHoc[100];
    public static void main(String[] args) {
        menu();
    }

    public static void showMenuContent() {
        System.out.println("-----------Phần mềm quản lý giảng viên-----------");
        System.out.println("1. Nhập danh sách giảng viên mới.");
        System.out.println("2. In ra danh sách giảng viên.");
        System.out.println("3. Nhập môn học mới");
        System.out.println("4. In ra danh sách môn học mới");
        System.out.print("Chọn để xử lý: ");

    }

    public static void menu() {
        while (true){
            showMenuContent();
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    inputNewTeacher();
                    break;
                case 2:
                    System.out.println("Danh sách");
                    inDanhSach();
                    break;
                case 3:
                    inputBook();
                    break;
                case 4:
                    System.out.println("in danh sách môn học");
                    inMonHoc();
                case 9:
                    return;

            }
        }
    }
    public static void inputNewTeacher() {
        System.out.print("Bạn muốn nhập bao nhiêu giảng viên: ");
        int teacherNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < teacherNumber; i++){
            System.out.println("Nhâp thông tin giảng viên thứ " + (i + 1));
            Teacher teacher = new Teacher();
            System.out.print("Nhập tên giảng viên: ");
            teacher.setName(new Scanner(System.in).nextLine());
            System.out.print("Nhập địa chỉ: ");
            teacher.setAddress(new Scanner(System.in).nextLine());
            System.out.print("Nhập số điện thoại: ");
            teacher.setPhone(new Scanner(System.in).nextLine());
            System.out.println("Nhập trình độ: ");
            System.out.println("1. GS_TS");
            System.out.println("2. PGS_TS");
            System.out.println("3. GIANG_VIEN_CHINH");
            System.out.println("4. TS");
            int leverChoice = new Scanner(System.in).nextInt();
            switch (leverChoice){
                case 1:
                    teacher.setLever(TeacherLever.GS_TS);
                    break;
                case 2:
                    teacher.setLever(TeacherLever.PGS_TS);
                    break;
                case 3:
                    teacher.setLever(TeacherLever.GIANG_VIEN_CHINH);
                    break;
                case 4:
                    teacher.setLever(TeacherLever.TS);
                    break;
            }
            for(int j = 0; j < teachers.length; j++){
                if(teachers[i] == null){
                    teachers[i] = teacher;
                    break;
                }
            }
        }
    }

    public static void inDanhSach() {
        for(int i = 0; i < teachers.length; i++){
            if(teachers[i] != null){
                System.out.println(teachers[i]);
            }
        }
    }

    public static void inputBook() {
        System.out.print("Bạn muốn nhập bao nhiêu môn học: ");
        int bookNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < bookNumber; i++){
            System.out.println("Nhập môn học " +  (i + 1));
            MonHoc monHoc = new MonHoc();
            System.out.print("Tên môn học: ");
            monHoc.setMonHoc(new Scanner(System.in).nextLine());
            System.out.print("Tổng số tiết môn học: ");
            monHoc.setTongSoTiet(new Scanner(System.in).nextInt());
            System.out.print("Tổng số tiết lý thuyết: ");
            monHoc.setSoTietLyThuyet(new Scanner(System.in).nextInt());
            System.out.print("Nhập kinh phí: ");
            monHoc.setMucKinhPhi(new Scanner(System.in).nextInt());
            for(int j = 0; j < monHocs.length; j++){
                if(monHocs[i] == null){
                    monHocs[i] = monHoc;
                    break;
                }
            }
        }
    }
    public static void inMonHoc() {
        for(int i = 0; i < monHocs.length; i++){
            if(monHocs[i] != null){
                System.out.println(monHocs[i]);
            }
        }
    }
}
