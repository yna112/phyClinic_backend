package com.yn.phyClinic.repo;

import com.yn.phyClinic.beans.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit,Integer> {
}
