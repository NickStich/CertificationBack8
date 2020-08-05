package com.example.cert.model.certification;

import com.example.cert.model.request.Request;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "certification")
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String title;

    @Column
    private Category category;

    @Column
    private double price;

    @JsonIgnore
    @OneToMany(mappedBy = "certification", cascade = CascadeType.ALL, fetch = FetchType.LAZY , targetEntity = Request.class)
    private List<Request> requests;


}
