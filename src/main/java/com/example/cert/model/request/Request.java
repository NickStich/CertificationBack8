package com.example.cert.model.request;

import com.example.cert.model.certification.Certification;
import com.example.cert.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private Quarter quarter;

    @Column
    private String justification;

    @Column
    private Status status;

    @ToString.Exclude
    @JsonIgnore
    @JsonManagedReference
    @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "useri_id")
    private User user;

    @ToString.Exclude
    @JsonIgnore
    @JsonManagedReference
    @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "certification_id")
    private Certification certification;

}
