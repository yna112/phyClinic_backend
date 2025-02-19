package com.yn.phyClinic.repo;

import com.yn.phyClinic.beans.Therapy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TherapyRepository extends JpaRepository<Therapy,Integer> {
    List<Therapy> findByPatient_id(int patientId);

}
