package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y) {
        super(name, 6, 3, 2, 3, 10, 10, 4, x, y,
                16);
    }


    @Override
    public String getInfo() {
        return getClass().getSimpleName();
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

