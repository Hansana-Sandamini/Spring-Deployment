package lk.ijse.aad.controller;

import lk.ijse.aad.dto.ApiResponse;
import lk.ijse.aad.dto.CustomerDTO;
import lk.ijse.aad.service.CustomerService;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<ApiResponse> saveCustomer(@RequestBody CustomerDTO customerDTO){
        return ResponseEntity.ok(new ApiResponse(
                200,
                "OK",
                customerService.saveCustomer(customerDTO))
        );
    }

}
