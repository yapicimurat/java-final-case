package repository;

import model.Brand;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BrandRepository {

    private List<Brand> brands = new ArrayList<>();

    public BrandRepository(){
        create(new Brand("Samsung"));
        create(new Brand("Lenovo"));
        create(new Brand("Apple"));
        create(new Brand("Huawei"));
        create(new Brand("Casper"));
        create(new Brand("Asus"));
        create(new Brand("HP"));
        create(new Brand("Xiaomi"));
        create(new Brand("Monster"));
    }

    public List<Brand> getAll(){
        return brands.stream()
                .sorted(Comparator.comparing(Brand::getName))
                .collect(Collectors.toList());
    }

    public Brand create(Brand brand){
        brands.add(brand);
        return brand;
    }

    public void delete(Brand brand){
        brands.remove(brand);
    }
}
