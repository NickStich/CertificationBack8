package com.example.cert.service;

import com.example.cert.model.Certification;
import com.example.cert.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
