package org.example12.logichandle;

import org.example12.entity.Client;
import org.example12.entity.Clienting;
import org.example12.entity.ClientingDetail;
import org.example12.entity.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientListLogic {
    private final Clienting[] clientings = new Clienting[100];
    private ClientList clientList;
    private ServiceList serviceList;

    public ClientListLogic(ClientList clientList, ServiceList serviceList) {
        this.clientList = clientList;
        this.serviceList = serviceList;
    }

    public void inputNewClient(){
        if(!clientList.clientIsNotEmpty() || !serviceList.serviceIsNotEmpty()){
            System.out.println("Không có dữ liệu xin hãy tạo thông tin ");
            return;
        }

        int clientNumber = 0;
        try{
            System.out.print("Nhập số lượng khách hàng cần xử lý: ");
            clientNumber = new Scanner(System.in).nextInt();
        }catch(InputMismatchException e){
            System.out.println("Hãy nhập số thứ tự");
        }
        for (int i = 0; i < clientNumber; i++) {
            System.out.println("Nhập khách hàng " + (i + 1));
            int clientId = 0;
            Client client = null;
            do {
                try {
                    System.out.print("Nhập id khách hàng: ");
                    clientId = new Scanner(System.in).nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Hãy nhập id nhé");
                }
                for (int j = 0; j < clientList.getClients().length; j++) {
                    if(clientList.getClients()[j] != null && clientList.getClients()[j].getId() == clientId){
                        client = clientList.getClients()[j];
                        break;
                    }
                }
                if(client != null){
                    break;
                }
                System.out.println("Không tồn tại Id khách hàng");
            }while (true);


            int serviceNumber = 0;
            try{
                System.out.print("Khách hàng sử dụng bao nhiêu dịch vụ: ");
                serviceNumber = new Scanner(System.in).nextInt();
            }catch(InputMismatchException e){
                System.out.println("Hãy nhập số thứ tự");
            }

            ClientingDetail[] details = new ClientingDetail[serviceNumber];
            int count = 0;
            for (int j = 0; j < serviceNumber; j++) {
                System.out.println("Dịch vụ "+ (j + 1));
                int serviceId = 0;
                Service service = null;
                do {
                    try {
                        System.out.print("Nhập mã dịch vụ: ");
                        serviceId = new Scanner(System.in).nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Hãy nhập số id dịch vụ");
                    }
                    for (int k = 0; k < serviceList.getServices().length; k++) {
                        if(serviceList.getServices()[k] != null && serviceList.getServices()[k].getMaDv() == serviceId){
                            service = serviceList.getServices()[k];
                            break;
                        }
                    }
                    if (service != null){
                        break;
                    }
                    System.out.println("Không tồn tại loại dịch vụ trong kho, xin mời nhập lại");
                }while (true);

                int numberService = 0;
                do {
                    try{
                        numberService = new Scanner(System.in).nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Hãy nhập số thứ tự");
                    }
                    break;
                }while (true);
                ClientingDetail clientingDetail = new ClientingDetail(service, numberService);
                details[count] = clientingDetail;
                count++;
            }
            Clienting clienting = new Clienting(client, details);
            saveClient(clienting);
        }
    }

    private void saveClient(Clienting clienting) {
        for (int i = 0; i < clientings.length; i++) {
            if(clientings[i] == null){
                clientings[i] = clienting;
                break;
            }
        }
    }

    public void showClienting(){
        for (int i = 0; i < clientings.length; i++) {
            if(clientings[i] != null){
                System.out.println(clientings[i]);
            }
        }
    }
    public void showSortByName(){
        Clienting[] sortByName = clientings.clone();
        int n = sortByName.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(sortByName[i] == null || sortByName[j] == null){
                    continue;
                }
                if(sortByName[i].getClient().getName().compareTo(sortByName[j].getClient().getName()) > 0){
                    Clienting tmp = sortByName[i];
                    sortByName[i] = sortByName[j];
                    sortByName[j] = tmp;
                }
            }
        }
        for (int i = 0; i < sortByName.length; i++) {
            if(sortByName[i] != null){
                System.out.println(sortByName[i]);
            }
        }
    }


}
