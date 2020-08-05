package com.example.cert.repository;

import com.example.cert.model.request.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request,Integer> {
}
