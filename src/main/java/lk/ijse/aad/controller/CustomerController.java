package lk.ijse.aad.controller;

import lk.ijse.aad.dto.ApiResponse;
import lk.ijse.aad.dto.CustomerDTO;
import lk.ijse.aad.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public String Customer(){
        return "Customer 1";
    }

    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        try {
            customerService.saveCustomer(customerDTO);
            return new ResponseEntity<>("Customer Saved", HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
