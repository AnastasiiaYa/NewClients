package com.example.demo.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.db.entity.Clients;


@Repository
public interface ClientsRepository extends MongoRepository<Clients, String>{}
