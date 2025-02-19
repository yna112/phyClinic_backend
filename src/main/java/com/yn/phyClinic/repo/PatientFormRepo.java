package com.yn.phyClinic.repo;

import com.yn.phyClinic.beans.PatientForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientFormRepo extends JpaRepository<PatientForm,Integer> {
}
