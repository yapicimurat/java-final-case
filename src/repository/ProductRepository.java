package repository;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();
    private List<ProductGroup> productGroups;

    private BrandRepository brandRepository = Config.getBrandRepositoryInstance();

    public ProductRepository(){
        List<Brand> brands = brandRepository.getAll();

        //Creating Product Groups
        productGroups = Config.getProductGroupRepositoryInstance().productGroups;

        //CREATING PRODUCT
        create(new MobilePhone(productGroups.get(0),
                1500.0,
                5.0,
                50,
                "Samsung J4 Plus",
                brands.get(0),
                16,
                5.1,
                4000,
                2,
                Color.BLACK.getName()));

        create(new MobilePhone(productGroups.get(0),
                40000.0,
                0.0,
                10,
                "Iphone 14 Pro Max",
                brands.get(2),
                1000,
                6.69,
                4323,
                6,
                Color.GOLD.getName()));

        create(new Notebook(productGroups.get(1),
                16000.0,
                10.0,
                28,
                "Macbook M1 Air",
                brands.get(2),
                8.0,
                256.0,
                MemoryType.SSD,
                13.3));

    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product create(Product product){
        products.add(product);
        return product;
    }

    public void delete(Product product){
        products.remove(product);
    }
}
