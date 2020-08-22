package pt.jarpsimoes.example.springboot.bootstrap;

import pt.jarpsimoes.example.springboot.domain.Product;
import pt.jarpsimoes.example.springboot.repositories.ProductRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = LogManager.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product shirt = new Product();
        shirt.setDescription("Example product 1");
        shirt.setPrice(new BigDecimal("20.00"));
        shirt.setImageUrl("https://www.everis.com/sites/all/themes/everis/logo.png");
        shirt.setProductId("123123123");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

    }
}
