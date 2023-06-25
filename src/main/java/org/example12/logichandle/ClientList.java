package org.example12.logichandle;

import org.example12.entity.Client;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientList {
    private Client[] clients = new Client[100];
    public Client[] getClients(){ return clients;};
    public void inputClient(){
        System.out.print("Bạn muốn thêm bao nhiêu khách hàng: ");
        int clientNumber = 0;
        try {
            clientNumber = new Scanner(System.in).nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Hãy nhập số thứ tự");
        }
        for (int i = 0; i < clientNumber; i++) {
            System.out.print("Khách hàng thứ " + (i + 1));
            Client client = new Client();
            client.inputInfo();
            saveClient(client);
        }
    }

    public void saveClient(Client client){
        for (int i = 0; i < clients.length; i++) {
            if(clients[i] == null){
                clients[i] = client;
                break;
            }
        }
    }

    public void showClient() {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null) {
                System.out.println(clients[i]);
            }
        }
    }

    public boolean clientIsNotEmpty(){
        for (int i = 0; i < clients.length; i++) {
            if(clients[i] == null){
                return true;
            }
        }
        return false;
    }
}
