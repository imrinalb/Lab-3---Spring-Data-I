package com.product.assignment3prob.Repository;

import com.product.assignment3prob.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
    //@Query(value = "select * FROM user ", nativeQuery = true)
    //public User getUserById(int id);
    public List<User> findByFirstNameContains(String firstName);

    @Query(value = "select * from user", nativeQuery = true)
    public List<User> getAllListByMyQuery();

}
