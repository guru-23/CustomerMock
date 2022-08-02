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
<<<<<<< HEAD
    public Customer hello(@RequestBody Customer customer){
        System.out.println("Input request>>"+customer);
        System.out.println("test branch change");
        String id = "99999";
        customer.setId(id);
        customers.put(id, customer);
=======
    public Customer makeCustomer(@RequestBody Customer customer){
        System.out.println("Input request>>"+customer);
        System.out.println("main branch change");
        String customerId = "112233";
        customer.setId(customerId);
        customers.put(customerId, customer);
>>>>>>> 4679ca38709bf156dff217ff1eacce5e15b613ce
        return customer;
    }

    @RequestMapping(path = "/customer", method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_XML_VALUE })
    public Customer getCustomer(@RequestParam String id){
        return  customers.get(id);
    }

}
