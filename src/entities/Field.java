package entities;

import java.util.Arrays;

public class Field {
    private FieldTile[][] field;
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public FieldTile[][] getField() {
        return field;
    }

    public void setField(FieldTile[][] field) {
        this.field = field;
    }

    public FieldTile getFieldTile(int x, int y) {
        return this.field[x][y];
    }

    public void setFieldTile(int x, int y, FieldTile tile) {
        this.field[x][y] = tile;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Field(){
        this(10,10);
    }

    public Field(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
        setField(new FieldTile[this.getHeight()][this.getWidth()]);
        for(int i = 0; i < this.getHeight(); i++){
            for(int j = 0; j < this.getWidth(); j++){
                setFieldTile(i, j, new FieldTile());
            }
        }
    }

    public String toString(int hX, int hY) {
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < this.getHeight(); x++){
            for(int y = 0; y < this.getWidth(); y++){
                if(x == hX && y == hY){
                    sb.append("H ");
                }else{
                    sb.append(this.getFieldTile(x, y).toString() + " ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
