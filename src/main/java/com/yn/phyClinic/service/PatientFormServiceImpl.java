package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.PatientForm;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import com.yn.phyClinic.repo.PatientFormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientFormServiceImpl implements PatientFormService{

    @Autowired
    private PatientFormRepo patientFormRepo;
    @Autowired
    private PatientService patientService;

    @Override
    public PatientForm createNewForm(PatientForm patientForm,int patientId) throws MyPhysClinicException {
        Patient patient=patientService.getPatientById(patientId);
        patientForm.setPatient(patient);
        return patientFormRepo.save(patientForm);
    }

    @Override
    public List<PatientForm> getPatientFormByPatientId(int patientId) {
        return null;
    }
}
