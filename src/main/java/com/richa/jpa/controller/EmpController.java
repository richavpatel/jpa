package com.richa.jpa.controller;

import com.richa.jpa.model.Employee;
import com.richa.jpa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping
    public Employee addEmp(@RequestBody Employee employee){
        return empService.addEmp(employee);
    }

    @GetMapping
    public List<Employee> listEmp(){
        return empService.listEmp();
    }
    @GetMapping(value = "/{id}")
    public Employee getOneEmp(@PathVariable int id){
        return empService.getOneEmp(id);
    }
    @PutMapping(value = "/{id}")
    public Employee updateEmp(@RequestBody Employee employee,@PathVariable int id){
        return empService.updateEmp(employee,id);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteEmp(@PathVariable int id){
        empService.deleteEmp(id);
    }


}
