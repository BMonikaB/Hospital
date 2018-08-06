package com.example.demo.domain;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    @Min(11)
    private String pesel;
    private Doctor doctor;
    @NotNull
    private String city;
    @NotNull
    private String street;
    @NotNull
    private String houseNumber;





    public Patient(String name, String lastName, String pesel, String city, String street, String houseNumber) {

        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Patient(){};


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) && Objects.equals(lastName, patient.lastName) && Objects.equals(pesel, patient.pesel) && Objects.equals(doctor, patient.doctor) && Objects.equals(city, patient.city) && Objects.equals(street, patient.street) && Objects.equals(houseNumber, patient.houseNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastName, pesel, doctor, city, street, houseNumber);
    }

    @Override
    public String toString() {
        return "Patient{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", pesel='" + pesel + '\'' + ", doctor=" + doctor + ", city='" + city + '\'' + ", street='" + street + '\'' + ", houseNumber='" + houseNumber + '\'' + '}';
    }
}
