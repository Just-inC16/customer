package com.tcs.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

	private CustomerRepository customerRepository;

	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@PostMapping("/register")
	public ResponseEntity<?> registerCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerRepository.save(customer));
	}

	// What happens if it doesn't exist?
	@GetMapping("/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable Long id) {
		Customer customerById = customerRepository.getReferenceById(id);
		Customer CustomerDto = new Customer(customerById.getId(), customerById.getName(), customerById.getEmail(),
				customerById.getPassword());
		return ResponseEntity.ok(CustomerDto);
	}
}