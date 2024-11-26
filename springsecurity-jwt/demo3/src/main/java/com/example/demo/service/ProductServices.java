package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductServices {

void delete(Long id);

Product get(Long id);

Product save(Product product);

List<Product> listAll();

}
