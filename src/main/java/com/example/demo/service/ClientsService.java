package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.db.entity.Clients;
import com.example.demo.db.repository.ClientsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientsService {
private final ClientsRepository clientsRepository;
	
public Clients get(String id){
	return clientsRepository.findById(id).orElse(null);
}

public Clients create(Clients clients){
	return clientsRepository.save(clients);
}

public Clients update(Clients clients){
	return clientsRepository.save(clients);
}

public void delete(String id) {
	clientsRepository.deleteById(id);
}
}
