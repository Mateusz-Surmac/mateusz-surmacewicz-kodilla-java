package com.kodilla.hibernate.inovice.dao;

import com.kodilla.hibernate.inovice.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}

