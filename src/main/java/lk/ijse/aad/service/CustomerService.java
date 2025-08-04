package lk.ijse.aad.service;

import lk.ijse.aad.dto.CustomerDTO;
import lk.ijse.aad.entity.Customer;
import lk.ijse.aad.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo  customerRepo;

    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = Customer.builder()
                .id(customerDTO.getId())
                .name(customerDTO.getName())
                .email(customerDTO.getEmail())
                .build();
        customerRepo.save(customer);
        return "Customer Saved Successfully";
    }
}
