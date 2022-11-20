
import model.Brand;
import model.ProductGroup;
import service.BrandService;
import service.ProductGroupService;
import service.ProductService;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class App {

    private static final String STORE_NAME = "PatikaStore";
    private static Scanner scanner = new Scanner(System.in);

    private static ProductService productService = new ProductService();
    private static ProductGroupService productGroupService = new ProductGroupService();
    private static BrandService brandService = new BrandService();

    public static void main(String args[]){

        System.out.println(STORE_NAME + " SANAL MAĞAZASINA HOŞ GELDİNİZ");

        try{
            initOperationSelection();


        }
        catch(NumberFormatException exception){
            System.out.println("Hatalı işlem numarası girildi.");
        }
    }

    private static void initOperationSelection(){

        boolean isContinue = true;

        while(isContinue){
            System.out.println("[1]ÜRÜN ARAMA, [2]TÜM ÜRÜNLERİ LİSTELE, [3]MARKALARI LİSTELE, [4]MARKA EKLE, [5]ÜRÜN SİL, [6]ÜRÜN GRUBU EKLE, [!!!]ÇIKMAK İÇİN BAŞKA BİR TUŞA BASINIZ");
            int selection = scanner.nextInt();

            switch (selection){
                case 1:
                    productFilterOperations();
                    break;

                case 2:
                    writeList(productService.getAll());
                    break;

                case 3:
                    writeList(brandService.getAll());
                    break;

                case 4:
                    System.out.print("Marka adı giriniz:");
                    String brandName = scanner.next();
                    brandService.create(new Brand(brandName));

                    System.out.println("Yeni bir marka oluşturuldu.");

                    writeList(brandService.getAll());
                    break;

                case 5:
                    System.out.print("Silmek istediğiniz ürünün ID'sini giriniz:");
                    String strID = scanner.next();

                    productService.delete(UUID.fromString(strID));
                    writeList(productService.getAll());
                    break;

                case 6:
                    System.out.print("Ürün grubu adı giriniz:");
                    String productGroupName = scanner.next();
                    productGroupService.create(new ProductGroup(productGroupName));
                    System.out.println("Yeni bir ürün grubu oluşturuldu.");

                    writeList(productGroupService.getAll());
                    break;

                default:
                    isContinue = false;
                    break;
            }
        }

    }

    private static void productFilterOperations(){
        System.out.println("[1]ID İLE ARAMA, [2]MARKA İLE ARAMA, [3]ÜRÜN ADI İLE ARAMA, [4] ÜRÜN GRUP ADI İLE ARAMA");

        int selection = scanner.nextInt();

        switch(selection){
            case 1:
                System.out.print("ID giriniz:");
                UUID id = stringToUUID(scanner.next());

                System.out.println(productService.getProductById(id).toString());
                break;

            case 2:
                System.out.print("Marka giriniz:");

                String brandName = scanner.next();
                writeList(productService.getProductsByBrandName(brandName));
                break;

            case 3:
                System.out.print("Ürün adı giriniz:");
                String productName = scanner.next();
                writeList(productService.getProductsByName(productName));
                break;

            case 4:
                System.out.print("Ürün grup adı giriniz:");
                String productGroupName = scanner.next();
                writeList(productService.getProductsByGroupName(productGroupName));
                break;

            default:
                System.out.println("HATALI SEÇİM YAPTINIZ.");
                break;
        }

    }

    private static UUID stringToUUID(String str){
        try{
            return UUID.fromString(str);
        }catch(Exception ex){
            System.out.println("HATALI ID GİRDİNİZ.");
        }

        return null;
    }

    //GENERIC LIST WRITER METHOD
    private static <T> void writeList(List<T> list){
        list.forEach(item -> System.out.println(item.toString()));
    }

}
