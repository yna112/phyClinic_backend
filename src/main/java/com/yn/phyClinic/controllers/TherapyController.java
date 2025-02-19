package com.yn.phyClinic.controllers;


import com.yn.phyClinic.beans.Therapy;
import com.yn.phyClinic.exceptions.MyPhysClinicException;
import com.yn.phyClinic.service.TherapyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/therapy")

public class TherapyController {

    @Autowired
    TherapyService therapyService;


    @PostMapping("/addTherapy{patient_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Therapy addNewTherapy(@RequestBody Therapy therapy, @PathVariable int patient_id) throws MyPhysClinicException {
        return therapyService.createNewTherapy(therapy,patient_id);
    }


    @GetMapping("getAllTherapies")
    @ResponseStatus(HttpStatus.OK)
    public List<Therapy> getAllTherapies(){
        return therapyService.getAllTherapies();
    }


    @GetMapping("/getTherapiesByPatient{patientId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Therapy>getTherapiesById(@PathVariable int patientId) throws MyPhysClinicException {
        return therapyService.getTherapiesByPatientId(patientId);
    }


}
