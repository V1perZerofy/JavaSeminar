package entities;

public class Pig {
    private int weight; //in g
    private String Name;

    public static void main(String[] Args){

    }

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
        return "Pig: name=" + this.getName() + ", weight=" + this.getWeight() + " grams";
    }

    public void run(){
        this.setWeight(this.getWeight() - 100);
    }

    public void eat(){
        this.setWeight(this.getWeight() + 500);
    }
}
