package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.PatientForm;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    boolean login(String userName,String password);
    Patient createNewPatient(Patient patient);
    List<Patient> getAllPatient();
    Patient getPatientById(int patientId) throws MyPhysClinicException;
    Patient updatePatientDetails(int patientId,Patient patient);
    List<PatientForm>getPatientFormByPatientId(int patientId);

}
