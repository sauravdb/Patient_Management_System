package com.sauravdb.basic.controller;

import com.sauravdb.basic.entity.PatientData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patientdata")
public class PatientDataAPI {

    PatientData patientData;

    @GetMapping("{patientId}")
    public PatientData getPatientData(String patientId) {

        return patientData;
    }

    @PostMapping
    public String createPatientData(@RequestBody PatientData patientData){
        this.patientData = patientData;
        return "Patient Added Successfully";
    }

    @PutMapping
    public String updatePatientData(@RequestBody PatientData patientData){
        this.patientData = patientData;
        return "Patient Updated Successfully";
    }

    @DeleteMapping("{patientId}")
    public String deletePatientData(String patientId) {
        this.patientData = null;
        return "Patient details deleted";
    }

}
