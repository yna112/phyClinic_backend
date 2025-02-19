package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Therapy;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TherapyService {
    Therapy createNewTherapy(Therapy therapy,int patient_id) throws MyPhysClinicException;
    List<Therapy> getAllTherapies();
    List<Therapy>getTherapiesByPatientId(int patientId) throws MyPhysClinicException;
    Therapy getTherapyByTherapyId(int therapyId) throws MyPhysClinicException;
    Therapy updateTherapy(int TherapyId,Therapy therapy);
}
