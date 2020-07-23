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
        Certification certification = new Certification(1,"dsfhgsdf","dfhgdsf", Category.CATEGORY1, Quarter.Q1,100.8,"lorem ipsum", Status.Approved);

        System.out.println("something");
    }
}
