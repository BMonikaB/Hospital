package com.example.demo.domain.repository;

import com.example.demo.domain.Description;
import com.example.demo.domain.Doctor;
import com.example.demo.utils.GenId;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Repository
public class DescriptionRepository {

    private Map<Integer, Description> descriptionList = new HashMap<>();

    public void addDescription(String description){

        Description description1 = new Description(description);
description1.setId(GenId.getNewId(descriptionList.keySet()));
        descriptionList.put(description1.getId(), description1);
    }


    @PostConstruct
    public void createDescription(){
        addDescription("Lecz");
        addDescription("Operuj");
        addDescription("Zrób obchód");
    }



    public List<Description> descriptionList(){
        List<Description> lista = new ArrayList<>(descriptionList.values());
        return lista;
    }

    ;
    public void saveDescription(Description description){
        description.setId(GenId.getNewId(descriptionList.keySet()));
        descriptionList.put(description.getId(),description);

    }

    @Override
    public String toString() {
        return "DescriptionRepository{" + "descriptionList=" + descriptionList + '}';
    }
}
