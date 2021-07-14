package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.entity.Clients;
import com.example.demo.service.ClientsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientsController {

	private final ClientsService clientsService;
	
	@GetMapping("/{id}")
	public Clients get(@PathVariable String id){
		return clientsService.get(id);
	}
	
	@PostMapping
	public Clients create(@RequestBody Clients clients) {
		return clientsService.create(clients);
	}
	
	@PutMapping
	public Clients update(@RequestBody Clients clients) {
		return clientsService.update(clients);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id){
		clientsService.delete(id);
	}
}
