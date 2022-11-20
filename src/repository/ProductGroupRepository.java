package repository;

import model.ProductGroup;

import java.util.ArrayList;
import java.util.List;

public class ProductGroupRepository {

    private List<ProductGroup> productGroups = new ArrayList<>();

    public ProductGroupRepository(){
        //Creating product groups
        create(new ProductGroup("Mobile Phone"));
        create(new ProductGroup("Notebook"));
    }

    public List<ProductGroup> getProductGroups(){
        return productGroups;
    }

    public ProductGroup create(ProductGroup productGroup){
        productGroups.add(productGroup);
        return productGroup;
    }

    public void delete(ProductGroup productGroup){
        productGroups.remove(productGroup);
    }

}
