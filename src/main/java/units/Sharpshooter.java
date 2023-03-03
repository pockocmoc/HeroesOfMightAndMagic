package units;

public class Sharpshooter extends Shooter {
    public Sharpshooter(String name, int x, int y) {
        super(name, 12, 10, 3, 4, 15, 15, 9, x, y,
                16);
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
