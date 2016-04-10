package ru.misha.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.misha.server.entity.Client;
import ru.misha.server.repository.ClientRepository;
import ru.misha.server.service.ClientService;

import java.util.Date;
import java.util.List;


@RestController
public class ServerController {

    @Autowired
    private ClientService service;

    //Срабатывает когда мы переходим по URL
    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    @ResponseBody
    public List<Client> getAllClients(){
        return service.getAll();
    }


    @RequestMapping(value = "/clients/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Client getClient(@PathVariable("id") long clientID){
        return service.getById(clientID);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    @ResponseBody
    public Client saveClient(@RequestBody Client client){ // Принимаем целый объект
        return service.save(client);
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delClient(@PathVariable long id){
        service.delete(id);
    }


}
