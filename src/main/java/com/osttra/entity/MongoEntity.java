package com.osttra.entity;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="mongodata")
public class MongoEntity {

	    
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
