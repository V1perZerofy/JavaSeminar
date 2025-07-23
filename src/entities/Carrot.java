package entities;

public class Carrot extends AVegetable{
    private double Length;
    private String type;

    public Carrot(){
        this(25.0, "Red Carrot");
    }

    public Carrot(String type){
        this(25.0, type);
    }

    public Carrot(double Length, String type) {
        setLength(Length);
        setType(type);
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        } else if(obj instanceof Carrot){
            return (((Carrot) obj).getLength()) == (this.getLength()) && (((Carrot) obj).getType()).equals(this.getType());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carrot{" +
                "circumference=" + this.getLength() +
                ", type='" + this.getType() + '\'' +
                '}';
    }

    public void grow(double amount){
        this.setLength(this.getLength() + amount);
    }

    public void getEaten(double amount){
        if(this.getLength() - amount > 0) {
            this.setLength(this.getLength() - amount);
        } else{
            this.setLength(0);
        }
    }
}
