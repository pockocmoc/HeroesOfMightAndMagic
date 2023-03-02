package units;

import java.util.ArrayList;

public class Pikeman extends Heroes {
    public Pikeman(String name, int x, int y) {
        super(name, 4, 5, 1, 3, 10, 10, 4, x, y);
    }


    @Override
    public String getInfo() {
        return getClass().getSimpleName() + " " + state;
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (!state.equals("Die")) {
            state = "Stand";

        }
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
