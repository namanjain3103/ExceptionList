package com.osttra.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osttra.entity.ExceptionList;
import com.osttra.entity.MongoData;
import com.osttra.repository.ExceptionRepository;
import com.osttra.repository.MongoDataRepository;


@Service
public class DataMigrationService {
	   
	    @Autowired
	    private MongoDataRepository mongoDataRepository;

	    @Autowired
	    private ExceptionRepository exceptionRepository;

	    public void migrateData() {
	    	
	    	List<MongoData> mongoDataList = mongoDataRepository.findAll();
	     
	      
	       for (MongoData mongoData : mongoDataList) {
	            ExceptionList exceptoinList = new ExceptionList();
	            exceptoinList.setExceptionId(mongoData.getExceptionId());
	            exceptoinList.setTradeId(mongoData.getTradeId());
	            exceptoinList.setCounterParty(mongoData.getCounterParty());
	            exceptoinList.setTradeDate(mongoData.getTradeDate());
	            exceptoinList.setExceptionType(mongoData.getExceptionType());
	            exceptoinList.setStatus(mongoData.getStatus());
	            exceptoinList.setPriority(mongoData.getPriority());
	            exceptoinList.setDescription(mongoData.getDescription());
	            exceptoinList.setCreatedBy(mongoData.getCreatedBy());
	            exceptoinList.setCreatedAt(mongoData.getCreatedAt());
	            exceptoinList.setUpdatedBy(mongoData.getUpdatedBy());
	            exceptoinList.setUpdatedAt(mongoData.getUpdatedAt());
	            exceptionRepository.save(exceptoinList);
	        }
	    }
}

