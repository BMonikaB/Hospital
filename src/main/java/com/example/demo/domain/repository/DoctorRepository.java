package com.example.demo.domain.repository;

import com.example.demo.domain.Doctor;
import com.example.demo.utils.GenId;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Repository
public class DoctorRepository {

    private Map<Integer, Doctor> doctorMap = new HashMap();


    public void addDoctor(String name, String lastName) {

        Doctor doctor = new Doctor(name, lastName);
        doctor.setId(GenId.getNewId(doctorMap.keySet()));
        doctorMap.put(doctor.getId(), doctor);
    }

    public List<Doctor> getDoctor() {
        List<Doctor> doctorList = new ArrayList<>(doctorMap.values());
        return doctorList;
    }

    public Map<Integer, Doctor> getDoctorMap() {
        return doctorMap;
    }

    public void removeDoctor(String name) {
        doctorMap.remove(name);
    }


    public void saveDoctor(Doctor doctor) {
        doctor.setId(GenId.getNewId(doctorMap.keySet()));
        doctorMap.put(doctor.getId(), doctor);

    }

    public void deleteDoctor(int id) {
        doctorMap.remove(id);
    }

    @PostConstruct
    public void createDOctor() {
        addDoctor("Anna", "Nowak");
        addDoctor("Adam", "Kowalski");
    }


    @Override
    public String toString() {
        return "DoctorRepository{" + "doctorMap=" + doctorMap + '}';
    }


}
