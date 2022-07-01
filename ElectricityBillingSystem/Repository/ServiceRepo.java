package com.project.ElectricityBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ElectricityBillingSystem.Entity.ServiceEntity;

//used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
public interface ServiceRepo extends JpaRepository<ServiceEntity,Integer>{

	//to get a crud methods into our type
}
