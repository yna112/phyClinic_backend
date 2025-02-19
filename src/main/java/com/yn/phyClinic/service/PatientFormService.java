package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.PatientForm;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientFormService {
    PatientForm createNewForm(PatientForm patientForm,int patientId) throws MyPhysClinicException;
    List<PatientForm>getPatientFormByPatientId(int patientId);
}
