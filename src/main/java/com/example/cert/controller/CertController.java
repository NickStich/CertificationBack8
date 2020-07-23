package com.example.cert.controller;

import com.example.cert.model.Certification;
import com.example.cert.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/certification")
public class CertController {

    @Autowired
    private CertificationService certificationService;


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCertification(@RequestBody Certification certification){
        certificationService.addCertification(certification);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Certification> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

}
