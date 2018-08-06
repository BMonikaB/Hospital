package com.example.demo.controllers;


import com.example.demo.domain.Doctor;
import com.example.demo.domain.Patient;
import com.example.demo.domain.repository.DoctorRepository;
import com.example.demo.domain.repository.PatientRepository;
import com.example.demo.service.PatientService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PatientController {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientService patientService;
    @Autowired
    DoctorRepository doctorRepository;


    @RequestMapping("/patients")
    public String printPatients(Model model) {
        List<Patient> patientList = patientRepository.getList();
        model.addAttribute("patients", patientList);
        return "patients";
    }

    @RequestMapping("/createpatient")
    public String createPatients(Model model) {
        model.addAttribute("patient", new Patient());
        return "createpatient";
    }


    @RequestMapping(value = "/patients", method = RequestMethod.POST)
    public String savePatients(@Valid Patient patient, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            System.out.println("Wpisz ponownie dane");
            return "createpatient";
        }
        else {
            patientService.savePatient(patient);
            return "redirect:/patients";
        }

    }

    @RequestMapping(value = "/patient/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        patientService.deletePatients(id);
        return "redirect:/patients";
    }


    //_________________________________________________________________________________
    @RequestMapping("/doctors")
    public String printDoctors(Model model) {
        List<Doctor> doctorList = doctorRepository.getDoctor();
        model.addAttribute("doctors", doctorList);
        return "doctors";
    }

    @RequestMapping("/createdoctor")
    public String createCoctor(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "createdoctors";
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.POST)
    public String saveDoctors(Doctor doctor) {
        patientService.saveDoctor(doctor);
        return "redirect:/doctors";
    }


    @RequestMapping(value = "/doctor/delete/{id}")
    public String deleteDoctor(@PathVariable("id") Integer id) {
        patientService.deleteDoctor(id);
        return "redirect:/doctors";
    }


}
