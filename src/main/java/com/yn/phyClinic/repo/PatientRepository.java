package com.yn.phyClinic.repo;

import com.yn.phyClinic.beans.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
