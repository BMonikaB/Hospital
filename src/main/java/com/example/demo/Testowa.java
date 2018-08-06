package com.example.demo;

import com.example.demo.controllers.PatientController;
import com.example.demo.domain.Doctor;
import com.example.demo.domain.repository.DoctorRepository;
import com.example.demo.domain.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Testowa implements CommandLineRunner {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(doctorRepository);

    }
}
