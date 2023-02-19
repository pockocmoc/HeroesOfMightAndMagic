package units;

public class Pikeman extends Heroes {
    public Pikeman(String name) {
        super(name, 4, 5, 1, 3, 10, 4);
    }



    @Override
    public String getInfo() {
        return "Pikeman " + name;
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
