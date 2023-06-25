package org.example12.entity;

public class ClientingDetail {
    private Service service;
    private int serviceNumber;

    public ClientingDetail(Service service, int serviceNumber) {
        this.service = service;
        this.serviceNumber = serviceNumber;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @Override
    public String toString() {
        return "ClientingDetail{" +
                "service=" + service +
                ", serviceNumber=" + serviceNumber +
                '}';
    }
}
