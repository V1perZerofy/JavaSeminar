package entities;

public class Onion extends AVegetable{
    private double circumference;
    private String type;

    public Onion(){
        this(25.0, "Red Onion");
    }

    public Onion(String type){
        this(25.0, type);
    }

    public Onion(double circumference, String type) {
        setCircumference(circumference);
        setType(type);
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
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
        } else if(obj instanceof Onion){
            return (((Onion) obj).getCircumference()) == (this.getCircumference()) && (((Onion) obj).getType()).equals(this.getType());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Onion{" +
                "circumference=" + this.getCircumference() +
                ", type='" + this.getType() + '\'' +
                '}';
    }

    public void grow(double amount){
        this.setCircumference(this.getCircumference() + amount);
    }

    public void getEaten(double amount){
        if(this.getCircumference() - amount > 0) {
            this.setCircumference(this.getCircumference() - amount);
        } else{
            this.setCircumference(0);
        }
    }
}
