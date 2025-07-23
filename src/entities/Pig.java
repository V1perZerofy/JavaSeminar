package entities;

public class Pig {
    private int weight; //in kg
    private String Name;

    public Pig() {
        this(230, "Hans");
    }

    public Pig(int weight){
        this(weight, "");
    }

    public Pig(int weight, String name) {
        setWeight(weight);
        setName(name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        } else if(obj instanceof Pig){
            return (((Pig) obj).getName()).equals(this.getName()) && (((Pig) obj).getWeight()) == this.getWeight();
        }
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pig{" +
                "weight=" + weight +
                ", Name='" + Name + '\'' +
                '}';
    }

    public void run(int steps){
        this.setWeight(this.getWeight() - steps);
    }

    public void eat(IEdible i, int units){
        this.setWeight(this.getWeight() + units);
        i.getEaten(units);
    }
}
