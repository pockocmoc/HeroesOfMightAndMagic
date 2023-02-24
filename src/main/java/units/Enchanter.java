package units;

public class Enchanter extends Healers {
    public Enchanter(String name, int x, int y) {
        super(-1, name, 17, 12, -5, -5, 30, 9, x, y);
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


    @Override
    public String toString() {
        return "Enchanter{" +
                "magicPoints=" + magicPoints +
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
