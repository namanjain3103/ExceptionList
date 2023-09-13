package com.osttra.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionList {

	    
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
