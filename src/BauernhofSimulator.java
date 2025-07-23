import entities.*;

public class BauernhofSimulator {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig1 = new Pig(200000, "Hans");
        System.out.println(pig1.toString());
        pig1.eat();
        System.out.println(pig1.toString());
        pig1.run();
        System.out.println(pig1.toString());
    }
}