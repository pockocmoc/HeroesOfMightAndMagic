package units;

import java.util.ArrayList;

public class Farmer extends Heroes {
    protected int deliveryOfArrows;


    public Farmer(String name, int x, int y) {
        super(name, 1, 1, 1, 1, 1, 1, 3, x, y);
        this.deliveryOfArrows = 1;
    }

    @Override
    public String getInfo() {
        return getClass().getSimpleName();
    }

    @Override
    public void step() {

    }


    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (!state.equals("Die")) state = "Stand";

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHP() {
        return hp;
    }

}
