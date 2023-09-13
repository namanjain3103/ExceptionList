package com.osttra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osttra.entity.ExceptionList;
import com.osttra.entity.MongoEntity;
import com.osttra.service.DataMigrationService;
import com.osttra.service.ExceptionService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ExceptionController {

    @Autowired
    ExceptionService exceptionService;
    
    @Autowired
    DataMigrationService mongoService;
    
    
    @GetMapping("/exception")
    public List<ExceptionList> getAllExceptions() {
    	System.out.println(exceptionService.getAllExceptions());
        return exceptionService.getAllExceptions();
    }
    
	@GetMapping("/get")
	public ResponseEntity<?> getAll(){
		
		List<MongoEntity> mongoData = mongoService.getAll();	
		if(mongoData.size()>0) {
			return new ResponseEntity<List<MongoEntity>>(mongoData, HttpStatus.OK);
		}
		else 
			return new ResponseEntity<>("data not available", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody MongoEntity mongoData){
		try {
			mongoService.create(mongoData);	
			return new ResponseEntity<MongoEntity>(mongoData, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}				
	}
	 
   @PostMapping("/migrate")
   public void migrate() {
	   mongoService.migrateData();
   }
    
    
}