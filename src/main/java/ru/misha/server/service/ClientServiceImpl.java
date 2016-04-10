package ru.misha.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.misha.server.entity.Client;
import ru.misha.server.repository.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository repository;

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public Client getById(long id) {
        return repository.findOne(id);
    }

    @Override
    public Client save(Client client) {
        return repository.saveAndFlush(client);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
