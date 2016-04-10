package ru.misha.server.service;


import ru.misha.server.entity.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAll();

    Client getById(long id);

    Client save(Client client);

    void delete(long id);

}
