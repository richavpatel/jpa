package com.richa.jpa.controller;

import com.richa.jpa.model.Manager;
import com.richa.jpa.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/managers")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @PostMapping
    public Manager addManager(@RequestBody Manager manager){
       return  managerService.addManager(manager);
    }
    @GetMapping
    public List<Manager> getList(){
        return managerService.listAll();
    }
    @GetMapping(value = "/{id}")
    public Manager getOneManager(@PathVariable int id){
        return managerService.getOne(id);
    }
    @PutMapping(value = "/{id}")
    public Manager updateManager(@PathVariable  int id, @RequestBody Manager manager){
        return managerService.updateManager(id, manager);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteManager(@PathVariable int id){
        managerService.deleteManager(id);
    }



}
