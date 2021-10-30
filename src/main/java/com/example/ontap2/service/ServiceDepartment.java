package com.example.ontap2.service;

import com.example.ontap2.entity.Department;
import com.example.ontap2.repository.RepositoryAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ServiceDepartment implements ServiceInterface{

    @Autowired
    RepositoryAPI repositoryAPI;

    @Override
    public Department getDepartment(int id) {
        return repositoryAPI.findById(id).get();
    }
}
