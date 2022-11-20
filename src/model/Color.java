package model;

public enum Color {
    WHITE("WHITE"),
    BLACK("BLACK"),
    RED("RED"),
    GOLD("GOLD"),
    SILVER("SILVER");

    private final String name;

    Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
