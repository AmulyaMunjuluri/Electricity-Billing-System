package com.project.ElectricityBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ElectricityBillingSystem.Entity.AddressEntity;

@Repository  
//used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
public interface AddressRepo extends JpaRepository<AddressEntity,Integer>{

}
