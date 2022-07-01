package com.project.ElectricityBillingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ElectricityBillingSystem.Entity.PaymentEntity;

//used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
public interface PaymentRepo  extends JpaRepository<PaymentEntity,Integer>{

}
