package com.example.demo.service;

import com.example.demo.domain.Doctor;
import com.example.demo.domain.Patient;
import com.example.demo.domain.repository.DoctorRepository;
import com.example.demo.domain.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorRepository doctorRepository;

    public void savePatient(Patient patient) {
        patientRepository.savePatient(patient);
    }

    public void saveDoctor(Doctor doctor) {
        doctorRepository.saveDoctor(doctor);
    }

    public void deletePatients(int id){
       patientRepository.deletePatients(id);
    }

    public void deleteDoctor(int id){
        doctorRepository.deleteDoctor(id);
    }



}
