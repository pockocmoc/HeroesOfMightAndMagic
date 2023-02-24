package units;

public class Pikeman extends Heroes {
    public Pikeman(String name, int x, int y) {
        super(1, name, 4, 5, 1, 3, 10, 4, x, y);
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


    @Override
    public String toString() {
        return "Pikeman{" +
                "vector2D=" + vector2D +
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
