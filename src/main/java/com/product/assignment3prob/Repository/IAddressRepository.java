package com.product.assignment3prob.Repository;

import com.product.assignment3prob.Entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Integer> {
}
