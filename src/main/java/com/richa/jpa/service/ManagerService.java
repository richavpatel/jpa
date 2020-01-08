package com.richa.jpa.service;

import com.richa.jpa.model.Manager;
import com.richa.jpa.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    public Manager addManager(Manager manager){
        return  managerRepository.save(manager);
    }
    public List<Manager> listAll(){
        return managerRepository.findAll();
    }
    public Manager updateManager(int id,Manager manager){
        return managerRepository.save(manager);
    }
    public void deleteManager(int id){
        managerRepository.deleteById(id);
    }

    public Manager getOne(int id) {
        return managerRepository.findById(id).get();
    }
}
