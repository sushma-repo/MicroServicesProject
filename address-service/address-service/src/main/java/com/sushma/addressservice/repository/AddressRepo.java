package com.sushma.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.addressservice.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{

}



