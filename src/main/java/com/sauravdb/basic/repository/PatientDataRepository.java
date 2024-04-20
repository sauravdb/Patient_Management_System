package com.sauravdb.basic.repository;

import com.sauravdb.basic.entity.PatientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDataRepository extends JpaRepository<PatientData, String> {
}
