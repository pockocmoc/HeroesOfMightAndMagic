package units;

import java.util.ArrayList;

public class Pikeman extends Warrior {
    public Pikeman(String name, int x, int y) {
        super(name, 4, 5, 1, 3, 100, 100, 4, x, y);
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
