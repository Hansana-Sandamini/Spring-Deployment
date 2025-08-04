package lk.ijse.aad.service.impl;

import lk.ijse.aad.dto.CustomerDTO;
import lk.ijse.aad.entity.Customer;
import lk.ijse.aad.repo.CustomerRepo;
import lk.ijse.aad.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepository;


    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if (customerRepository.existsById(customerDTO.getId())) {
            throw new RuntimeException("Customer already exists with ID: " + customerDTO.getId());
        }

        // Manual conversion from DTO to Entity
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());

        customerRepository.save(customer);
    }

}
