package repository;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository(){
        List<Brand> brands = Config.getBrandRepositoryInstance().getAll();
        List<ProductGroup> productGroups = Config.getProductGroupRepositoryInstance().getProductGroups();

        //CREATING PRODUCT
        create(new MobilePhone(productGroups.get(0),
                1500.0,
                5.0,
                50,
                "Samsung J4 Plus",
                brands.get(7),
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
                brands.get(0),
                1000,
                6.69,
                4323,
                6,
                Color.GOLD.getName()));

        create(new Notebook(productGroups.get(0),
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
