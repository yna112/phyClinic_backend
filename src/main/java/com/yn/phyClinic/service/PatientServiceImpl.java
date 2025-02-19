package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.PatientForm;
import com.yn.phyClinic.exceptions.ErrMes;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import com.yn.phyClinic.repo.PatientFormRepo;
import com.yn.phyClinic.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    private PatientFormRepo patientFormRepo;


    @Override
    public boolean login(String userName, String password) {
        return userName.equals("1234") && password.equals("1234");
    }

    @Override
    public Patient createNewPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int patientId) throws MyPhysClinicException {
        return patientRepository.findById(patientId).orElseThrow(() -> new MyPhysClinicException(ErrMes.THE_PATIENT_IS_NOT_EXIST));
    }

    @Override
    public Patient updatePatientDetails(int patientId, Patient patient) {
        return null;
    }




    @Override
    public List<PatientForm> getPatientFormByPatientId(int patientId) {
        return null;
    }


}
