package service;

import exception.EntityNotFoundException;
import model.ProductGroup;
import repository.Config;
import repository.ProductGroupRepository;

import java.util.List;
import java.util.UUID;

public class ProductGroupService {

    private ProductGroupRepository productGroupRepository = Config.getProductGroupRepositoryInstance();

    public List<ProductGroup> getAll(){
        return productGroupRepository.getProductGroups();
    }

    public ProductGroup getById(UUID id){
       return findProductGroupById(id);
    }

    public ProductGroup create(ProductGroup productGroup){
        return productGroupRepository.create(productGroup);
    }

    public void delete(UUID id){
        productGroupRepository.delete(findProductGroupById(id));
    }

    private ProductGroup findProductGroupById(UUID id){
        return productGroupRepository.getProductGroups()
                .stream()
                .filter(productGroup -> productGroup.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Ürün grubu bulunamadı."));
    }
}
