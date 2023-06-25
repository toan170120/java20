package org.example12.entity;

import org.example12.statics.ClientLever;

import java.util.Scanner;

public class Client extends Person{
    private static int AUTO_ID = 10000;
    private int Id;
    private ClientLever clientLever;

    public Client() {
        this.Id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public ClientLever getClientLever() {
        return clientLever;
    }

    public void setClientLever(ClientLever clientLever) {
        this.clientLever = clientLever;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", clientLever=" + clientLever +
                ", name='" + name + '\'' +
                ", addess='" + addess + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo(){
        super.inputInfo();
        System.out.println("Nhập trình độ: ");
        System.out.println("1. Cá nhân");
        System.out.println("2. Đại diện đơn vị hành chính");
        System.out.println("3. Đại diện đơn vị kinh doanh");
        System.out.print("Bạn chọn: ");
        int clientLv;
        do {
            clientLv = new Scanner(System.in).nextInt();
            if(clientLv >= 1 && clientLv <= 3){
                break;
            }
            System.out.print("Nhập sai chọn lại");
        }while (true);
        switch (clientLv){
            case 1:
                this.setClientLever(ClientLever.CN);
                break;
            case 2:
                this.setClientLever(ClientLever.DDDVHC);
                break;
            case 3:
                this.setClientLever(ClientLever.DDDVKD);
                break;
        }
    }
}
