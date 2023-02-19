package units;

public class Peasant extends Heroes {
    protected int deliveryOfArrows;

    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 1, 3);
        this.deliveryOfArrows = 1;
    }

    @Override
    public String getInfo() {
        return "Peasant " + name;
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
