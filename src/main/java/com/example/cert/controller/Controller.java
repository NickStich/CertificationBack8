package com.example.cert.controller;


import com.example.cert.model.certification.Certification;
import com.example.cert.model.request.Request;
import com.example.cert.service.CertificationService;
import com.example.cert.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private CertificationService certificationService;

    @Autowired
    private RequestService requestService;

// Certification CRUD ____________________________

    @RequestMapping(method = RequestMethod.POST, value = "/certification", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCertification(@RequestBody Certification certification) {
        certificationService.addCertification(certification);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/certification")
    public List<Certification> getAllCertifications() {
//        certificationService.hack();
        return certificationService.getAllCertifications();
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/certification")
    public Certification updateCertification(@RequestBody Certification certification) {
       return certificationService.updateCertification(certification);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/certification/{id}")
    public void deleteCertification(@PathVariable("id") int id){
        certificationService.deleteCertification(id);
    }

// Request CRUD ____________________________

    @PostMapping(value = "/request" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addRequest(@RequestBody Request request){
        requestService.addRequest(request);
    }

    @GetMapping(value = "/request" )
    public List<Request> getAllRequests(){
        return requestService.getAllRequests();
    }

    @PutMapping(value = "/request" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Request updateRequest(@RequestBody Request request) {
        return requestService.updateRequest(request);
    }

    @DeleteMapping(value = "/request/{id}")
    public void deleteRequest(@PathVariable("id") int id){
        requestService.deleteRequest(id);
    }
}
