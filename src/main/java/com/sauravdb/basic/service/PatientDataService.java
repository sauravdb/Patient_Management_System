package com.sauravdb.basic.service;

import com.sauravdb.basic.entity.PatientData;

import java.util.List;

public interface PatientDataService {

    public String createPatientData(PatientData patientData);
    public String updatePatientData(PatientData patientData);
    public String deletePatientData(String patientId);
    public PatientData getPatientData(String patientId);
    public List<PatientData> getAllPatientData();

}
