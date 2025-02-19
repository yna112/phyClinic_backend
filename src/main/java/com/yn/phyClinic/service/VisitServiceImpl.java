package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.Visit;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import com.yn.phyClinic.repo.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    VisitRepository visitRepository;

    @Autowired
    PatientService patientService;

    @Override
    public Visit createNewVisit(Visit visit, int patientId) throws MyPhysClinicException {
        Patient patient=patientService.getPatientById(patientId);
        visit.setPatient(patient);
        return visitRepository.save(visit);
    }

    @Override
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }

    @Override
    public List<Visit> getVisitsByPatientId(int patientId) {
        return null;
    }
}
