package com.example.demo.configuration;


import com.example.demo.domain.Description;
import com.example.demo.domain.Doctor;
import com.example.demo.domain.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MainConfig {
/*
    @Bean
    public Description desc(){
        return new Description();
    }

    @Bean
    public Doctor doctor(){
        Doctor doctor = new Doctor();
        doctor.setDescription(desc());
        return doctor;
    }

    @Bean
    public Patient patient(){
        Patient patient = new Patient();
        patient.setDoctor(doctor());
        return patient;
    }

*/
}
