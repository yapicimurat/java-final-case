package model;

import java.util.UUID;

public class Notebook extends Product{

    private Double RAMCapacityInGB;

    private Double memoryInGB;

    private model.MemoryType memoryType;

    private Double screenSizeInInch;

    public Notebook(ProductGroup productGroup,
                    Double unitPrice,
                    Double rangeOfDiscount,
                    Integer amountOfStock,
                    String name,
                    Brand brand,
                    Double RAMCapacityInGB,
                    Double memoryInGB,
                    MemoryType memoryType,
                    Double screenSizeInInch) {
        super(productGroup, unitPrice, rangeOfDiscount, amountOfStock, name, brand);
        this.RAMCapacityInGB = RAMCapacityInGB;
        this.memoryInGB = memoryInGB;
        this.memoryType = memoryType;
        this.screenSizeInInch = screenSizeInInch;
    }

    @Override
    public String toString() {
        return
            "[ÜRÜN] - ID = " + id +
            ", Ürün Grubu = " + productGroup.getName() +
            ", Birim Fiyatı = " + unitPrice +
            ", İndirim Oranı = " + rangeOfDiscount +
            ", Stok Miktarı = " + amountOfStock +
            ", Ürün Adı = '" + name + '\'' +
            ", Marka = " + brand +
            " RAM = " + RAMCapacityInGB +
            ", Hafıza = " + memoryInGB + " " + memoryType.name() +
            ", Ekran Boyutu = " + screenSizeInInch;

    }
}
