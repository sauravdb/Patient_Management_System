package com.sauravdb.basic.service.Impl;

import com.sauravdb.basic.entity.PatientData;
import com.sauravdb.basic.repository.PatientDataRepository;
import com.sauravdb.basic.service.PatientDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDataServiceImpl implements PatientDataService {

    public PatientDataServiceImpl(PatientDataRepository patientDataRepository) {
        this.patientDataRepository = patientDataRepository;
    }

    PatientDataRepository patientDataRepository;

    @Override
    public String createPatientData(PatientData patientData) {
        patientDataRepository.save(patientData);
        return "Success";
    }

    @Override
    public String updatePatientData(PatientData patientData) {
        patientDataRepository.save(patientData);
        return "Success";
    }

    @Override
    public String deletePatientData(String patientId) {
        patientDataRepository.deleteById(patientId);
        return "Deleted";
    }

    @Override
    public PatientData getPatientData(String patientId) {
        return patientDataRepository.findById(patientId).get();
    }

    @Override
    public List<PatientData> getAllPatientData() {
        return patientDataRepository.findAll();
    }
}
