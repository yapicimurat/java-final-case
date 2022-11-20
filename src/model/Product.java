package model;

import java.util.UUID;

public class Product {

   protected UUID id;

   protected ProductGroup productGroup;

   protected Double unitPrice;

   protected Double rangeOfDiscount;

   protected Integer amountOfStock;

   protected String name;

   protected Brand brand;

   public Product(ProductGroup productGroup, Double unitPrice, Double rangeOfDiscount, Integer amountOfStock, String name, Brand brand){
      this.id = UUID.randomUUID();
      this.productGroup = productGroup;
      this.unitPrice = unitPrice;
      this.rangeOfDiscount = rangeOfDiscount;
      this.amountOfStock = amountOfStock;
      this.name = name;
      this.brand = brand;
   }


   public UUID getId() {
      return id;
   }

   public ProductGroup getProductGroup() {
      return productGroup;
   }

   public void setProductGroup(ProductGroup productGroup) {
      this.productGroup = productGroup;
   }

   public double getUnitPrice() {
      return unitPrice;
   }

   public void setUnitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
   }

   public double getRangeOfDiscount() {
      return rangeOfDiscount;
   }

   public void setRangeOfDiscount(double rangeOfDiscount) {
      this.rangeOfDiscount = rangeOfDiscount;
   }

   public int getAmountOfStock() {
      return amountOfStock;
   }

   public void setAmountOfStock(int amountOfStock) {
      this.amountOfStock = amountOfStock;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Brand getBrand() {
      return brand;
   }

   public void setBrand(Brand brand) {
      this.brand = brand;
   }
}
