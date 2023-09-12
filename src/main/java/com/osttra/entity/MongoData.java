package com.osttra.entity;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@Document(collection = "mongodb_collection")
public class MongoData {

	    
	    @Id
	    private String exceptionId;
	 
	    private String tradeId;
	    private String counterParty;
	    private String tradeDate;
	    private String exceptionType;
	    private String status;
	    private String priority;
	    private String description;
	    private String createdBy;
	    private String createdAt;
	    private String updatedBy;
	    private String updatedAt;
	
}
