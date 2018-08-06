package com.example.demo.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Doctor extends Description {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private Description description;


    public void setDescription(Description description) {
        this.description = description;
    }



    public Doctor(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

    public Doctor(){};


    public void setId(Integer id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name) && Objects.equals(lastName, doctor.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}
