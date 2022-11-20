package service;

import exception.EntityNotFoundException;
import model.Brand;
import repository.Config;
import repository.BrandRepository;
import java.util.List;
import java.util.UUID;

public class BrandService {

    private BrandRepository brandRepository = Config.getBrandRepositoryInstance();

    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

    public Brand getBrandById(UUID id){
        return findBrandById(id);
    }

    public Brand create(Brand brand){
        return brandRepository.create(brand);
    }

    public void delete(Brand brand){
        brandRepository.delete(brand);
    }

    private Brand findBrandById(UUID id) {
        return brandRepository.getAll().stream()
                .filter(brand -> brand.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Marka bulunamadı."));
    }
}
