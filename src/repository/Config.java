package repository;


public final class Config {

    //LAZY LOADING SINGLETON PATTERN
    private static ProductRepository productRepository;
    private static ProductGroupRepository productGroupRepository;
    private static BrandRepository brandRepository;

    public static BrandRepository getBrandRepositoryInstance() {
        if(brandRepository == null)
        {
            brandRepository = new BrandRepository();

        }
        return brandRepository;
    }

    public static ProductGroupRepository getProductGroupRepositoryInstance() {
        if(productGroupRepository == null)
        {
            productGroupRepository = new ProductGroupRepository();

        }
        return productGroupRepository;
    }

    public static ProductRepository getProductRepositoryInstance() {
        if(productRepository == null){
            productRepository = new ProductRepository();
        }
        return productRepository;
    }
}
