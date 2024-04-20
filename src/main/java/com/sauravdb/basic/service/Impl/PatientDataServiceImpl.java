package com.sauravdb.basic.service.Impl;

import com.sauravdb.basic.entity.PatientData;
import com.sauravdb.basic.repository.PatientDataRepository;
import com.sauravdb.basic.service.PatientDataService;

import java.util.List;

public class PatientDataServiceImpl implements PatientDataService {

    public PatientDataServiceImpl(PatientDataRepository patientDataRepository) {
        this.patientDataRepository = patientDataRepository;
    }

    PatientDataRepository patientDataRepository;
    @Override
    public String createPatientData(PatientData patientData) {
        return null;
    }

    @Override
    public String updatePatientData(PatientData patientData) {
        return null;
    }

    @Override
    public String deletePatientData(String patientId) {
        return null;
    }

    @Override
    public String getPatientData(String patientId) {
        return null;
    }

    @Override
    public List<PatientData> getAllPatientData() {
        return null;
    }
}
