package service;

import exception.EntityNotFoundException;
import model.Product;
import repository.Config;
import repository.ProductRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository productRepository = Config.getProductRepositoryInstance();

    public List<Product> getAll() {
        return productRepository.getAllProducts();
    }

    public List<Product> getProductsByGroupName(String groupName){
        return productRepository.getAllProducts().stream()
                .filter(product -> product.getProductGroup().getName().equals(groupName))
                .collect(Collectors.toList());
    }

    public Product getProductById(UUID id){
        return findProductById(id);
    }

    public List<Product> getProductsByBrandName(String brandName){
        return productRepository.getAllProducts()
                .stream().filter(product -> product.getBrand().getName().equals(brandName))
                .collect(Collectors.toList());
    }

    public List<Product> getProductsByName(String productName){
        return productRepository.getAllProducts()
                .stream().filter(product -> product.getName().equals(productName))
                .collect(Collectors.toList());
    }

    public Product create(Product product){
        return productRepository.create(product);
    }

    public void delete(UUID id){
        productRepository.delete(findProductById(id));
    }

    private Product findProductById(UUID id) {
        return productRepository.getAllProducts().stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Ürün bulunamadı."));
    }
}
