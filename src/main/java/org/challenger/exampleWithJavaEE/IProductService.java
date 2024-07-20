package org.challenger.exampleWithJavaEE;

import org.challenger.exampleWithJavaEE.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(Product product);
    void updateProduct(Product product);
}
