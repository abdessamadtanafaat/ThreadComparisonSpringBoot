package com.example.threadsvsvirtualthreads.Service;

import com.example.threadsvsvirtualthreads.Models.Product;
import com.example.threadsvsvirtualthreads.Repository.ProductRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductsService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getProducts() throws InterruptedException {
        Thread.sleep(1000); // simuler la latence réseau
        System.out.println(Thread.currentThread().isVirtual());
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Nombre de cœurs du processeur : " + cores);

        return productRepository.findAll();
    }
    public String bulkSaveProduct() throws InterruptedException {
        for(int i=0; i< 1000; i++) {
            Product product = new Product();
                    product.setProductName(RandomStringUtils.randomAlphanumeric(5));
            product.setPrice(RandomUtils.nextLong(10,1000));
            product.setPrice(1L);
            saveOrUpdate(product);
        }
        return "finished";
    }
    public Product getProductsById(Long id)
    {
        return productRepository.findById(id).get();
    }
    public void saveOrUpdate(Product product)
    {
        productRepository.save(product);
    }
//deleting a specific record by using the method deleteById() of
    public void delete(long id)
    {
        productRepository.deleteById(id);
    }
    //updating a record
    public void update(Product product, long productid)
    {
        productRepository.save(product);
    }
}
