package com.example.demo.domain.repository;

import com.example.demo.domain.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.example.demo.utils.GenId;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.criteria.CriteriaBuilder;

@Repository
public class PatientRepository {

    private Map<Integer, Patient> patientMap = new HashMap<>();


    public void addPatient(String name, String lastName, String pesel, String city, String street, String houseNumber) {
        Patient patient = new Patient(name, lastName, pesel, city, street, houseNumber);
        patient.setId(GenId.getNewId(patientMap.keySet()));
        patientMap.put(patient.getId(), patient);
    }


    public List<Patient> getList() {
        List<Patient> list = new ArrayList<>(patientMap.values());
        return list;
    }

    public void deletePatients(int id) {
        patientMap.remove(id);
    }

    public Map<Integer, Patient> getPatientMap()

    {
        return patientMap;
    }


    @PostConstruct
    public void createPatients() {
        addPatient("Anna", "Kot", "39894793", "Wrocław", "Nowowiejska", "89/9");
        addPatient("Anna", "Kot", "39894793", "Wrocław", "Nowowiejska", "89/9");
    }


    public void savePatient(Patient patient) {
        patient.setId(GenId.getNewId(patientMap.keySet()));
        patientMap.put(patient.getId(), patient);
    }

    @Override
    public String toString() {
        return "PatientRepository{" + "patientMap=" + patientMap + '}';
    }


}
