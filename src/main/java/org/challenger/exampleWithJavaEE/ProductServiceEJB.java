package org.challenger.exampleWithJavaEE;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.challenger.exampleWithJavaEE.entity.Product;

import java.util.List;

@Local
@Stateless
public class ProductServiceEJB  {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Product> getAllProducts() {
        return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    public void addProduct(Product product) {
        entityManager.persist(product);
    }

    public void deleteProduct(Long productId) {
        Product product = entityManager.find(Product.class, productId);
        if (product != null) {
            entityManager.remove(product);
        }

    }

    public void updateProduct(Product product) {
        entityManager.merge(product);
    }
}
