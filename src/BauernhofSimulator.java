import entities.*;

import javax.sound.midi.Soundbank;
import java.util.*;

public class BauernhofSimulator {
    public static void main(String[] args) throws CloneNotSupportedException {
        Field f1 = new Field(5, 10);
        Harvester h1 = new Harvester(0, 0);
        Scanner s = new Scanner(System.in);
        int lager = 0;



        while(true){
            System.out.println(f1.toString(h1.getX(), h1.getY()));
            System.out.println("Enter Command (up/down/left/right/harvest/quit)");
            String cmd = s.nextLine();
            if(cmd.equals("quit"))break;
            if(cmd.equals("harvest"))f1.getFieldTile(h1.getX(), h1.getY()).harvest();
            else{
                h1.move(cmd, f1);
            }
        }
    }
}