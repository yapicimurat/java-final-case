package model;

import java.util.UUID;

public class ProductGroup {

    private UUID id;

    private String name;

    public ProductGroup(String name){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ÜRÜN GRUBU] - " +
                " ID = " + id +
                " İsim = '" + name + '\'';
    }
}
