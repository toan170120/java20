package org.example12.logichandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLogic {
    private final ClientList clientList = new ClientList();
    private final ServiceList serviceList = new ServiceList();
    private final ClientListLogic clientListLogic = new ClientListLogic(clientList, serviceList);


    public void menu(){
        while (true){
            showMenu();
            int choice = function();
            switch (choice){
                case 1:
                    clientList.inputClient();
                    break;
                case 2:
                    clientList.showClient();
                    break;
                case 3:
                    serviceList.inputService();
                    break;
                case 4:
                    serviceList.showService();
                    break;
                case 5:
                    clientListLogic.inputNewClient();
                    break;
                case 6:
                    clientListLogic.showClienting();
                    break;
                case 7:
                    clientListLogic.showSortByName();
                    break;
                case 8:

                    break;
                case 10:
                    return;
            }
        }
    }

    private int function() {
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 9) {
                    break;
                }
                System.out.println("Nhập sai, mời nhập lại: ");
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai, mời nhập lại: ");
            }
        } while (true);
        return choice;
    }

    private void showMenu(){
        System.out.println("-------Quản lý dịch vụ khách hàng-----------");
        System.out.println("1. Thêm mới danh sách khách.");
        System.out.println("2. In danh sách khách hàng.");
        System.out.println("3. Thêm mới dịch vụ");
        System.out.println("4. In thông tin dịch vụ");
        System.out.println("5. Quản lý dịch vụ khách hàng");
        System.out.println("6. In danh sách khách hàng đã sử dụng dịch vụ");
        System.out.println("7. Sắp xếp theo tên khách hàng");
        System.out.println("8. Sắp xếp theo số lượng dịch vụ");
        System.out.println("9. Tính tiền cho mỗi khách hàng");
        System.out.println("10. Hết dịch vụ, bạn cân thoát");
        System.out.println("Bạn chọn: ");
    }
}
