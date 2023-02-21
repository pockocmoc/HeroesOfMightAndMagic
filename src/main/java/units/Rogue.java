package units;

public class Rogue extends Heroes {
    public Rogue(String name, int x, int y) {
        super(name, 8, 3, 2, 4, 10, 6, x, y);
    }


    @Override
    public String getInfo() {
        return "Rouge " + name;
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
