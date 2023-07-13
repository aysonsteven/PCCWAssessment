package com.springboot.assessment.service;

import java.util.List;

import com.springboot.assessment.entity.TblCustomer;

public interface CrudService {
    


    public void createNewCustomer(TblCustomer body);


    public List<TblCustomer> getAllCustomer();

    public List<TblCustomer> getAllActiveCustomer();

    public String deleteCustomer(long id);


    public TblCustomer updateCustomer(TblCustomer customer);
}
