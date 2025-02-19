package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Visit;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface VisitService {
    Visit createNewVisit(Visit visit, int patientId) throws MyPhysClinicException;
    List<Visit> getAllVisits();
    List<Visit> getVisitsByPatientId(int patientId);
}
