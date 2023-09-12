package com.osttra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osttra.entity.ExceptionList;

@Repository
public interface ExceptionRepository extends JpaRepository<ExceptionList, Long> {
	
}
