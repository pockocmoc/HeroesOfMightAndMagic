package units;

public class Sharpshooter extends Shooter {


    public Sharpshooter(String name, int x, int y) {
        super(name, 12, 10, 8, 10, 15, 9,
                x, y, 2, 32);
    }

    @Override
    public String getInfo() {
        return "Sharpshooter " + name;
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
