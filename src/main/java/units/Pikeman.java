package units;

import java.util.ArrayList;

public class Pikeman extends Heroes {
    public Pikeman(String name, int x, int y) {
        super(name, 4, 5, 1, 3, 10, 4, x, y);
    }



    @Override
    public String getInfo() {
        return "Pikeman " + name;
    }

    @Override
    public void step() {

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHP() {
        return health;
    }

    @Override
    public void step(ArrayList<Heroes> teamOne, ArrayList<Heroes> teamTwo) {

    }
}
