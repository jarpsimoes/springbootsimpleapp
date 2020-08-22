package pt.jarpsimoes.example.springboot.services;


import pt.jarpsimoes.example.springboot.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
