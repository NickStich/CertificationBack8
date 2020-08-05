package com.example.cert.service;

import com.example.cert.model.request.Request;
import com.example.cert.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    
    @Autowired
    private RequestRepository requestRepository;


    public Request addRequest(Request request){
        return requestRepository.save(request);
    }

    public List<Request> getAllRequests() {
        return (List<Request>) requestRepository.findAll();
    }

    public Request updateRequest(Request request){
        return requestRepository.save(request);
    }

    public void deleteRequest(int id){
        requestRepository.deleteById(id);
    }
}
