package units;

public class Enchanter extends Healers {
    public Enchanter(String name, int x, int y) {
        super(name, 17, 12, -5, -5, 30, 9, x, y, 1);
    }



    @Override
    public String getInfo() {
        return "Enchanter " + name;
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
