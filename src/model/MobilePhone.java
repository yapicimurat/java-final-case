package model;

import java.util.UUID;

public class MobilePhone extends Product{

    private int memoryInGB;

    private double screenSizeInInch;

    private double batteryPower;

    private double RAMCapacityInGB;

    private String color;

    public MobilePhone(ProductGroup productGroup,
                       Double unitPrice,
                       Double rangeOfDiscount,
                       Integer amountOfStock,
                       String name,
                       Brand brand,
                       int memoryInGB,
                       double screenSizeInInch,
                       double batteryPower,
                       double RAMCapacityInGB,
                       String color) {
        super(productGroup, unitPrice, rangeOfDiscount, amountOfStock, name, brand);
        this.memoryInGB = memoryInGB;
        this.screenSizeInInch = screenSizeInInch;
        this.batteryPower = batteryPower;
        this.RAMCapacityInGB = RAMCapacityInGB;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[ÜRÜN] - ID = " + id +
            ", Ürün Grup Adı = " + productGroup.getName() +
            ", Birim Fiyat = " + unitPrice +
            ", İndirim Oranı = " + rangeOfDiscount +
            ", Stok Miktarı = " + amountOfStock +
            ", Ürün Adı = '" + name + '\'' +
            ", Marka = " + brand.getName() +
            ", Hafıza = " + memoryInGB +
            ", Ekran Boyutu = " + screenSizeInInch +
            ", Batarya Gücü = " + batteryPower +
            ", RAM = " + RAMCapacityInGB +
            ", Renk = '" + color + '\'';
    }
}