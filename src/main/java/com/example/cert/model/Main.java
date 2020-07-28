package com.example.cert.model;

import com.example.cert.model.Category;
import com.example.cert.model.Certification;
import com.example.cert.model.Quarter;
import com.example.cert.model.Status;
import com.fasterxml.classmate.AnnotationConfiguration;
import com.fasterxml.classmate.AnnotationInclusion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Certification certification = new Certification();

        System.out.println("something");
    }
}
