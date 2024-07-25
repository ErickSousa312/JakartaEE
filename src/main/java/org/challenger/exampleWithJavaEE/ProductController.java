package org.challenger.exampleWithJavaEE;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.challenger.exampleWithJavaEE.entity.Product;

import java.util.List;

//isso é manageBean
@RequestScoped
@Named
public class ProductController {

    @Inject
    private ProductServiceEJB productService;

    private List<Product> products;
    private Product newProduct;

    @PostConstruct
    public void init() {
       products = productService.getAllProducts();
       newProduct = new Product();
    }

    public void saveProduct() {
        productService.addProduct(newProduct);
        newProduct = new Product();
        products = productService.getAllProducts();
    }

    public void deleteProduct(Long productId) {
        productService.deleteProduct(productId);
        products = productService.getAllProducts();
    }

    public ProductServiceEJB getProductService() {
        return productService;
    }

    public void setProductService(ProductServiceEJB productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }
}
