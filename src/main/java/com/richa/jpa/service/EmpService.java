package com.richa.jpa.service;

import com.richa.jpa.model.Employee;
import com.richa.jpa.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public Employee addEmp(Employee employee){
        return empRepository.save(employee);}

        public List<Employee> listEmp(){
        return empRepository.findAll();
        }
        public Employee getOneEmp(int id){
        return empRepository.findById(id).get();
        }
        public Employee updateEmp(Employee employee, int id){
        return empRepository.save(employee);
        }
        public void deleteEmp(int id){
        empRepository.deleteById(id);
        }
}
