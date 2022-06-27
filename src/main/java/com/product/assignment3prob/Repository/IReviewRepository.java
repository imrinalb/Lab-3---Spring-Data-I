package com.product.assignment3prob.Repository;

import com.product.assignment3prob.Entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends CrudRepository<Review, Integer> {
}
