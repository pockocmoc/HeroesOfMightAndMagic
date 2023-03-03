package units;

import java.util.ArrayList;

public class Rogue extends Warrior {
    public Rogue(String name, int x, int y) {
        super(name, 8, 3, 2, 4, 100, 100, 6, x, y);
    }

    @Override
    public String getInfo() {
        return getClass().getSimpleName() + " " + state;
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
        return hp;
    }


}
