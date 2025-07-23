package entities;

public class FieldTile {
    enum State {Growing, Ripe, Harvested};

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public FieldTile(){
        this.setState(State.Growing);
    }

    public void grow(){
        if(this.getState() == State.Growing){
            this.setState(State.Ripe);
        }
    }

    public void harvest(){
        this.setState(State.Harvested);
    }

    @Override
    public String toString() {
        return switch (state) {
            case Growing -> "1";
            case Ripe -> "2";
            case Harvested -> "0";
        };
    }
}
