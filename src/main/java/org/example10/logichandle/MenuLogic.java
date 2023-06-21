package org.example10.logichandle;

import java.util.Scanner;

public class MenuLogic {
    private final ReporterLogic reporterLogic = new ReporterLogic();
    private final PostsLogic postsLogic = new PostsLogic();

    private final ReportingLogic reportingLogic = new ReportingLogic(reporterLogic, postsLogic);
    public void menu(){
        while (true){
            showContent();
            int choice = function();
            switch (choice){
                case 1:
                    reporterLogic.inputReporter();
                    break;
                case 2:
                    reporterLogic.showReporter();
                    break;
                case 3:
                    postsLogic.inputPosts();
                    break;
                case 4:
                    postsLogic.showPosts();
                    break;
                case 5:
                    reportingLogic.inputNewReporter();
                    break;
                case 6:
                    reportingLogic.showReporting();
                    break;
                case 7:
                    reportingLogic.showReportingByName();
                    break;
                case 9:
                    reportingLogic.calculateSalary();
                    break;
                case 10:
                    return;
            }
        }
    }

    private int function(){
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        } while (true);
        return choice;
    }
    private void showContent(){
        System.out.println("---------Quản lý trả nhuận bút cho phóng viên-------------");
        System.out.println("1. Nhập danh sách phóng viên");
        System.out.println("2. In ra danh sách phóng viên");
        System.out.println("3. Nhập danh sách bài viết");
        System.out.println("4. In danh sách bài viết");
        System.out.println("5. Lập bảng tính");
        System.out.println("6. In bảng tính");
        System.out.println("7. Sắp xếp theo tên phóng viên");
        System.out.println("8. Số lượng bài viết giảm dần");
        System.out.println("9. Lập bảng kê thu nhập phóng viên");
        System.out.println("10. Hết rồi, mời bạn thoát");
        System.out.print("Mời chọn: ");
    }
}
