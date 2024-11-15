package com.example.threadsvsvirtualthreads.Repository;

import com.example.threadsvsvirtualthreads.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Long> {
}
