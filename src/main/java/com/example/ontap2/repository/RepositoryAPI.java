package com.example.ontap2.repository;

import antlr.debug.DebuggingParser;
import com.example.ontap2.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAPI extends JpaRepository<Department,Integer> {
}
