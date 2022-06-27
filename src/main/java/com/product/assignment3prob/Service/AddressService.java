package com.product.assignment3prob.Service;

import com.product.assignment3prob.Entity.Address;
import com.product.assignment3prob.Repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private IAddressRepository iAddressRepository;

    public List<Address> getAllAddress(){
        return (List<Address>) iAddressRepository.findAll();
    }

    public Optional<Address> getAddressById(int id){
        return iAddressRepository.findById(id);
    }

    public void deleteAddress(){
        iAddressRepository.deleteAll();
    }

    public void deleteAddressById(int id){
        iAddressRepository.deleteById(id);
    }

    public Address createAddress(Address address){
        return iAddressRepository.save(address);
    }

    public Address updateAddress(int id, Address address){
        return iAddressRepository.save(address);
    }
}
