package com.product.assignment3prob.Service;

import com.product.assignment3prob.DTO.UserAddressDto;
import com.product.assignment3prob.Entity.User;
import com.product.assignment3prob.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUserRepository iUserRepository;


//    public Iterable<User> getAllUser(){
//        return iUserRepository.findAll();
//    }
//
//    private UserAddressDto convertEntityDto(User user){
//        UserAddressDto userAddressDto= new UserAddressDto();
//        userAddressDto.setUserId(user.getId());
//        userAddressDto.setEmail(user.getEmail());
//        userAddressDto.setPassword(user.getPassword());
//        userAddressDto.setCity(user.getAddress().getCity());
//        return userAddressDto;
//    }

    public List<User> getAllUser(){
        return (List<User>) iUserRepository.findAll();
    }

    public Optional<User> getUserById(int id){
        return iUserRepository.findById(id);
    }

    public void deleteAllUser(){
        iUserRepository.deleteAll();
    }

    public void deleteUserById(int id){
        iUserRepository.deleteById(id);
    }

    public User updateUserById(int id, User user){
        return iUserRepository.save(user);
    }

    public User createUser(User user){
        return iUserRepository.save(user);
    }

    public List<User> findByFirstnameComtain(String name) {
        return iUserRepository.findByFirstNameContains(name);
    }

    public List<User> getAllListByMyQuery() {
        return iUserRepository.getAllListByMyQuery();
    }
}
