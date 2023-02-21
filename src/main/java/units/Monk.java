package units;

public class Monk extends Healers {
    public Monk(String name, int x, int y) {
        super(name, 12, 7, -4, -4, 30, 5, x, y, 1);
    }



    @Override
    public String getInfo() {
        return "Monk " + name;
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

