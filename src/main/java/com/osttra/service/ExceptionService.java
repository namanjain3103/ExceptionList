package com.osttra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osttra.entity.ExceptionList;
import com.osttra.repository.ExceptionRepository;


@Service
public class ExceptionService {

@Autowired
ExceptionRepository exceptionRepository;


public List<ExceptionList> getAllExceptions() {
	
	System.out.println("in the service");
	
    return exceptionRepository.findAll();

}
}