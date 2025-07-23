package entities;

import java.util.Objects;

public abstract class AVegetable implements IEdible {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public AVegetable(){
        this("Standard Gemüse");
    }

    public AVegetable(String type){
        this.setType(type);
    }

    @Override
    public String toString() {
        return "AVegetable{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AVegetable that)) return false;
        return Objects.equals(type, that.type);
    }

    public abstract void grow(double amount);
    public abstract void getEaten(double amount);
}
