package com.data.visualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.visualization.model.Data;

@Repository
public interface  Datarepository extends JpaRepository<Data, Integer > {

	
	
	
	
	
}
