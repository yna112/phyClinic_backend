package com.yn.phyClinic.beans;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String mail;
    private Date dateOfBirth;
    private int age;
    private String city;
    private int height;
    private int weight;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},mappedBy = "patient")
    @Singular("therapy")
    private List<Therapy>therapyList=new ArrayList<>();
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},mappedBy = "patient")
    @Singular("patientForm")
    private List<PatientForm>patientFormList=new ArrayList<>();




}
