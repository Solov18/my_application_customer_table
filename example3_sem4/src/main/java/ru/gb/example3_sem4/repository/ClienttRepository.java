package ru.gb.example3_sem4.repository;


import org.springframework.stereotype.Repository;
import ru.gb.example3_sem4.model.Client;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienttRepository {
    List<Client> clients = new ArrayList<>();

    public void addClient(Client client)
    {
        clients.add(client);
    }

    public List<Client> getClients()
    {
        return clients;
    }

}
