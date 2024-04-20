package com.sauravdb.basic.controller;

import com.sauravdb.basic.entity.PatientData;
import com.sauravdb.basic.service.PatientDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientdata")
public class PatientDataController {

    PatientDataService patientDataService;

    public PatientDataController(PatientDataService patientDataService) {
        this.patientDataService = patientDataService;
    }

    //Read specific patient details from database
    @GetMapping("{patientId}")
    public PatientData getPatientData(@PathVariable("patientId") String patientId) {
        return patientDataService.getPatientData(patientId);
    }

    //All patient details from database
    @GetMapping()
    public List<PatientData> getAllPatientData() {
        return patientDataService.getAllPatientData();
    }

    @PostMapping
    public String createPatientData(@RequestBody PatientData patientData){
        patientDataService.createPatientData(patientData);
        return "Patient created successfully";
    }

    @PutMapping
    public String updatePatientData(@RequestBody PatientData patientData){
        patientDataService.updatePatientData(patientData);
        return "Patient updated successfully";
    }

    @DeleteMapping("{patientId}")
    public String deletePatientData(@PathVariable("patientId") String patientId) {
        patientDataService.deletePatientData(patientId);
        return "Patient data deleted successfully";
    }

}
