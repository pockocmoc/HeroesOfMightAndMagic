package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name) {
        super(name, 6, 3, 2, 3, 10, 4, 2, 16);
    }


    @Override
    public String getInfo() {
        return "Crossbowman " + name;
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
}
