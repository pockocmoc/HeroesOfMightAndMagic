package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y) {
        super(name, 6, 3, 8, 10, 15, 10, 8, x, y, 16);
    }


    @Override
    public String getInfo() {
        return getClass().getSimpleName() + " " + state;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHP() {
        return hp;
    }


    public void step() {

    }


}

