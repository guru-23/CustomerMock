package com.company.CustomerMock;

import com.company.CustomerMS.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomerController {
    public static Map<String, Customer> customers = new HashMap();

    @RequestMapping(path = "/customer", method = RequestMethod.POST,
            consumes = { MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_XML_VALUE })
    public Customer createCustomer(@RequestBody Customer customer){
        System.out.println("Input request>>"+customer);
        String customerId = String.valueOf((int) (Math.random() * 100000));
        customer.setId(customerId);
        customers.put(customerId, customer);
        return customer;
    }

    @RequestMapping(path = "/customer", method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_XML_VALUE })
    public Customer getCustomer(@RequestParam String id){
        return  customers.get(id);
    }

}
