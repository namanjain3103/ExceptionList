package com.osttra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osttra.entity.ExceptionList;
import com.osttra.service.DataMigrationService;
import com.osttra.service.ExceptionService;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @Autowired
    ExceptionService exceptionService;
    
    @Autowired
    DataMigrationService dataMigrationService;
    
    @CrossOrigin
    @GetMapping("/exception")
    public List<ExceptionList> getAllExceptions() {
    	System.out.println(exceptionService.getAllExceptions());
        return exceptionService.getAllExceptions();
    }
    
    @PostMapping("/e")
    public void check() {
    	System.out.println(" hi this is working");
    	try {
    		dataMigrationService.migrateData();
    	}catch(Exception e)
    	{
    		System.out.println(e);
    		e.printStackTrace();
    	}
    	
    	
    }
}