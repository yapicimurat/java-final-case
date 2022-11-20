package model;

import java.util.UUID;

public class Brand {

    private UUID id;

    private String name;

    public Brand(String name) {
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
        return "Marka - " +
                " ID = " + id +
                " İsim = '" + name + '\'';
    }
}
