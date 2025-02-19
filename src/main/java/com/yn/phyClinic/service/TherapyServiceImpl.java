package com.yn.phyClinic.service;

import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.Therapy;
import com.yn.phyClinic.exceptions.ErrMes;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import com.yn.phyClinic.repo.PatientRepository;
import com.yn.phyClinic.repo.TherapyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TherapyServiceImpl implements TherapyService{

    @Autowired
    TherapyRepository therapyRepository;

    @Autowired
    PatientService patientService;


    @Override
    public Therapy createNewTherapy(Therapy therapy, int patient_id) throws MyPhysClinicException {
        Patient patient=patientService.getPatientById(patient_id);

        therapy.setPatient(patient);
        therapy.setPatientFirstName(patient.getFirstName());
        therapy.setPatientLastName(patient.getLastName());
        System.out.println("IM HERE IN THE SERVICE!");
        return therapyRepository.save(therapy);    }


    @Override
    public List<Therapy> getAllTherapies() {
        return therapyRepository.findAll();
    }

    @Override
    public List<Therapy> getTherapiesByPatientId(int patientId) throws MyPhysClinicException {
        return therapyRepository.findByPatient_id(patientId);
    }

    @Override
    public Therapy getTherapyByTherapyId(int therapyId) throws MyPhysClinicException {
        return therapyRepository.findById(therapyId).orElseThrow(()->new MyPhysClinicException(ErrMes.THE_THERAPY_IS_NOT_EXIST));
    }

    @Override
    public Therapy updateTherapy(int TherapyId, Therapy therapy) {
        return null;
    }
}
