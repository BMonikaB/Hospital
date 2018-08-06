package com.example.demo.domain;


import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;


public class Description {


    private int id;
    private String description;


    public Description(String description)
    {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Description(){}


    @Override
    public String toString() {
        return "Description{" + "description='" + description + '\'' + '}';
    }
}
