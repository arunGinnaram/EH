package com.arun.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arun.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Serializable> {

}
