package ru.misha.server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.misha.server.entity.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{

}
