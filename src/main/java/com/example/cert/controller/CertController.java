package com.example.cert.controller;

import com.example.cert.model.Certification;
import com.example.cert.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certification")
public class CertController {

    @Autowired
    private CertificationService certificationService;


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCertification(@RequestBody Certification certification) {
        certificationService.addCertification(certification);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Certification> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Certification updateCertification(@RequestBody Certification certification) {
       return certificationService.updateCertification(certification);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCertification(@PathVariable("id") int id){
        certificationService.deleteCertification(id);
    }
}
