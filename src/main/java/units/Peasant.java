package units;

public class Peasant extends Heroes {
    protected int deliveryOfArrows;

    public Peasant(String name, int x, int y) {
        super(-1, name, 1, 1, 1, 1, 1, 3, x, y);
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


    @Override
    public String toString() {
        return "Peasant{" +
                "deliveryOfArrows=" + deliveryOfArrows +
                ", vector2D=" + vector2D +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    public String getFullInfo() {
        System.out.println(this);
        return ("");
    }
}
