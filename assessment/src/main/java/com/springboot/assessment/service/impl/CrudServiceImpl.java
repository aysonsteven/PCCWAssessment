package com.springboot.assessment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.assessment.entity.TblCustomer;
import com.springboot.assessment.repository.CustomerRepository;
import com.springboot.assessment.service.CrudService;
import com.springboot.assessment.service.NotificationService;

@Service
public class CrudServiceImpl implements CrudService {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private NotificationService notifService;

    @Override
    public void createNewCustomer(TblCustomer body) {
        try {
            customerRepository.save(body);

            notifService.sendNotification(body);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public List<TblCustomer> getAllCustomer() {
        // TODO Auto-generated method stub
        return customerRepository.findAll();
    }

    @Override
    public List<TblCustomer> getAllActiveCustomer() {
        // TODO Auto-generated method stub
        return customerRepository.findAllByIsActive(true);
    }

    @Override
    public String deleteCustomer(long id) {
        // TODO Auto-generated method stub
        TblCustomer customer = new TblCustomer();
        customer = customerRepository.findById(id).get();
        customer.setIsActive(false);
        customerRepository.save(customer);
        return "ok";
    }

    @Override
    public TblCustomer updateCustomer(TblCustomer customer) {
        // TODO Auto-generated method stub
        return customerRepository.save(customer);
    }
    
}
