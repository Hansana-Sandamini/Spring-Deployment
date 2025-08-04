package lk.ijse.aad.service;

import lk.ijse.aad.dto.CustomerDTO;
import lk.ijse.aad.entity.Customer;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
}
