package com.project.ElectricityBillingSystem.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ElectricityBillingSystem.Entity.AddressEntity;
import com.project.ElectricityBillingSystem.Exceptions.AddressNotFoundException;
import com.project.ElectricityBillingSystem.Services.AddressService;

@RestController
//allows to handle all rest APIs such get,post,put/patch,delete requests
public class AddressController {
	
	//used to autowire bean on the setter method just like @Required annotation
	@Autowired
	private AddressService addressServices;
	
	// mapping HTTP GET requests onto specific handler methods
	@GetMapping("/address")
	public List<AddressEntity> getAllAddress() {
		return addressServices.getAllAddress();
	}
	
	@GetMapping("address/{id}")
	public Optional<AddressEntity> getAddressById(@PathVariable int id) throws AddressNotFoundException {
		
		return addressServices.getAddress(id);
	}
	
	// handle HTTP POST requests matched with given URI expressions
	@PostMapping("address")
	public AddressEntity addAddress(@Valid @RequestBody AddressEntity addressEntity) {
		return addressServices.addAddress(addressEntity);
	}
	
	//used to update/modify resources by id
	@PatchMapping("address/{id}")
	public AddressEntity updateAddress(@PathVariable int id,@Valid @RequestBody AddressEntity addressEntity) throws AddressNotFoundException {
		return addressServices.updateAddress(id, addressEntity);
	}
	
	//used to delete by id 
	@DeleteMapping("address/{id}")
	public Optional<AddressEntity> deleteAddress(@PathVariable int id) throws AddressNotFoundException{
		return addressServices.deleteAddress(id);
	}


}
