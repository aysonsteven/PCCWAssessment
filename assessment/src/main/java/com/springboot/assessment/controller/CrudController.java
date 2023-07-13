package com.springboot.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assessment.entity.TblCustomer;
import com.springboot.assessment.service.CrudService;

@RestController
@RequestMapping("/customer")
public class CrudController {


    @Autowired
    private CrudService crud;
    
    @PostMapping("/register")
    public String createNew(@RequestBody TblCustomer body){
        System.out.println(body.getName());
        crud.createNewCustomer(body);
        return "ok";
    }
    
    
    @GetMapping("/getall")
    public List<TblCustomer> getAllCustomer(){
    	return crud.getAllCustomer();
    }


    @GetMapping("getallactive")
    public List<TblCustomer> getAllActive(){
        return crud.getAllActiveCustomer();
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") String id){
        return crud.deleteCustomer(Long.valueOf(id));
    }

    @PatchMapping("/update")
    public TblCustomer updateCustomer(@RequestBody TblCustomer customer){
        return crud.updateCustomer(customer);
    }
}
