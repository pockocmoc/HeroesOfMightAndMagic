package units;

public class Enchanter extends Healers {
    public Enchanter(String name, int x, int y) {
        super(name, 17, 12, -5, -5, 30, 30,
                9, x, y, 10, 10);
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
