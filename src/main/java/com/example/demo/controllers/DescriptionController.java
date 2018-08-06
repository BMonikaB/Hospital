package com.example.demo.controllers;

import com.example.demo.domain.Description;
import com.example.demo.domain.Doctor;
import com.example.demo.domain.repository.DescriptionRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class DescriptionController {

    @Autowired
    DescriptionRepository descriptionRepository;

    @RequestMapping("/description")
    public String printDescription(Model model){
        List<Description> descriptionList = descriptionRepository.descriptionList();
        model.addAttribute("listDescription" , descriptionList);
        return "description";
    }

    @RequestMapping("/createdescription")
    public String createDescription(Model model){
        model.addAttribute("description", new Description());
        return "createdescription";
    }


    @RequestMapping(value = "/description", method = RequestMethod.POST)
    public String printDescription(Description description){
        descriptionRepository.saveDescription(description);
        return "redirect:/description";
    }


}
