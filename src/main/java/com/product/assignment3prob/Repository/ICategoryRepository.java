package com.product.assignment3prob.Repository;

import com.product.assignment3prob.Entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends CrudRepository<Category, Integer> {
}
