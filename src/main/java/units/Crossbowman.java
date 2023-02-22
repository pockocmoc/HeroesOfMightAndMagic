package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y) {
        super(name, 6, 3, 2, 3, 10, 4, x, y, 2, 16);
    }


    @Override
    public String getInfo() {
        return "Crossbowman " + name;
    }

    @Override
    public void step() {
        if (health > 0 && maxArrows > 0) {


        }
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
        return "Crossbowman{" +
                "shotsInOneMove=" + shotsInOneMove +
                ", maxArrows=" + maxArrows +
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
}
