package entities;

import java.util.Objects;

public abstract class AObst implements IEdible{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public AObst(){
        this("Standard Obst");
    }

    public AObst(String type){
        this.setType(type);
    }

    @Override
    public String toString() {
        return "AObst{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AObst that)) return false;
        return Objects.equals(type, that.type);
    }

    public abstract void grow(double amount);
    public abstract void getEaten(double amount);
}
