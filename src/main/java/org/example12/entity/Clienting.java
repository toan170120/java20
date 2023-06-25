package org.example12.entity;

import java.util.Arrays;

public class Clienting {
    private Client client;
    private ClientingDetail[] details;

    public Clienting(Client client, ClientingDetail[] details) {
        this.client = client;
        this.details = details;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ClientingDetail[] getDetails() {
        return details;
    }

    public void setDetails(ClientingDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Clienting{" +
                "client=" + client +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
