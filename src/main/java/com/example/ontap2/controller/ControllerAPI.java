package com.example.ontap2.controller;

import com.example.ontap2.entity.Department;
import com.example.ontap2.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {

    @Autowired
    ServiceInterface serviceInterface;

    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable int id){
        return  serviceInterface.getDepartment(id);
    }

}
