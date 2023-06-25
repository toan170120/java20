package org.example12.logichandle;

import org.example12.entity.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceList {
    private Service[] services = new Service[100];
    public Service[] getServices(){return services;};
    public void inputService(){
        System.out.print("Bạn muốn thêm bao nhiêu dịch vu: ");
        int serviceNumber = 0;
        try {
            serviceNumber = new Scanner(System.in).nextInt();

        }catch(InputMismatchException e){
            System.out.println("Hãy nhập số thứ tự");
        }
        for (int i = 0; i < serviceNumber; i++) {
            System.out.println("Nhập dịch vụ thứ " +(i + 1));
            Service service = new Service();
            service.inputInfo();
            saveService(service);
        }

    }

    private void saveService(Service service) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] == null){
                services[i] = service;
                break;
            }
        }
    }

    public void showService(){
        for (int i = 0; i < services.length; i++) {
            if(services[i] != null){
                System.out.println(services[i]);
            }
        }
    }

    public boolean serviceIsNotEmpty(){
        for (int i = 0; i < services.length; i++) {
            if(services[i] == null){
                return true;
            }
        }
        return false;
    }
}
