package units;

import java.util.ArrayList;

public class Peasant extends Heroes {
    protected int deliveryOfArrows;

    public Peasant(String name, int x, int y) {
        super(name, 1, 1, 1, 1, 1, 3, x, y);
        this.deliveryOfArrows = 1;
    }

    @Override
    public String getInfo() {
        return "Peasant " + name;
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
