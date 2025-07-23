package entities;

public class Harvester {
    private int x, y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Harvester(){
        this(0, 0);
    }

    public Harvester(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void move(String dir, Field field){
        switch (dir.toLowerCase()){
            case "up": if(this.getY() > 0) x--; break;
            case "down": if(this.getY() < field.getHeight()) x++; break;
            case "left": if(this.getX() > 0) y--; break;
            case "right": if(this.getX() < field.getWidth()) y++; break;
        }
    }

    public void harvest(Field field){
        if(field.getFieldTile(this.getX(), this.getY()).getState() != FieldTile.State.Harvested){
            field.getFieldTile(this.getX(), this.getY()).harvest();
        }
    }
}
