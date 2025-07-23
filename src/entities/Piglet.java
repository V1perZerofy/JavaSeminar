package entities;

public class Piglet extends Pig{
    private String furcolor;

    // Getter / Setter
    public String getFurcolor() {
        return furcolor;
    }

    public void setFurcolor(String furcolor) {
        this.furcolor = furcolor;
    }

    // Constructors
    public Piglet(){
        this("pink");
    }

    public Piglet(String furcolor) {
        this(80000, "Peter", furcolor);
    }

    public Piglet(int weight, String furcolor) {
        this(weight, "Peter", furcolor);
    }

    public Piglet(int weight, String name, String furcolor) {
        super(weight, name);
        this.setFurcolor(furcolor);
    }

    @Override
    public String toString() {
        return "Piglet{" +
                "furcolor='" + furcolor + '\'' +
                ", name=" + super.getName() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                "} ";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Piglet){
            Piglet f = (Piglet) o;
            return super.equals(f) && f.getFurcolor().equals(this.getFurcolor());
        }
        return false;
    }
}
