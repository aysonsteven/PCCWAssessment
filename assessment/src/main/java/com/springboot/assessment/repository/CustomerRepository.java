package com.springboot.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.assessment.entity.TblCustomer;


@Repository
public interface CustomerRepository extends JpaRepository<TblCustomer, Long>{
    List<TblCustomer> findAllByIsActive(Boolean isActive);
}
