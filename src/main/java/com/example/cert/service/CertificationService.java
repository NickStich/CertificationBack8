package com.example.cert.service;

import com.example.cert.model.certification.Category;
import com.example.cert.model.certification.Certification;
import com.example.cert.model.request.Quarter;
import com.example.cert.model.request.Request;
import com.example.cert.model.request.Status;
import com.example.cert.model.user.Role;
import com.example.cert.model.user.User;
import com.example.cert.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;


    public Certification addCertification(Certification certification){
        return certificationRepository.save(certification);
    }

    public List<Certification> getAllCertifications() {
        return (List<Certification>) certificationRepository.findAll();
    }

    public Certification updateCertification(Certification certification){
        return certificationRepository.save(certification);
    }

    public void deleteCertification(int id){
        certificationRepository.deleteById(id);
    }

//    public void hack(){
//        Certification certification = new Certification();
//        certification.setCategory(Category.CATEGORY2);
//        certification.setPrice(1000);
//        certification.setTitle("Java from scratch");
//
//        User user = new User();
//        user.setUserName("Nicu");
//        user.s(Role.USER);
//
//        Request request = new Request();
//        request.setQuarter(Quarter.Q1);
//        request.setStatus(Status.Pending);
//        request.setJustification("I need");
//        request.setCertification(certification);
//        request.setUser(user);
//
//        Request request1 = new Request();
//        request1.setQuarter(Quarter.Q4);
//        request1.setStatus(Status.Rejected);
//        request1.setJustification("Blah blah");
//        request1.setCertification(certification);
//        request1.setUser(user);
//
//        List<Request>requests = new ArrayList<>();
//        requests.add(request);
//        requests.add(request1);
//
//        certification.setRequests(requests);
//        user.setRequests(requests);
//
//        certificationRepository.save(certification);
//    }

}
