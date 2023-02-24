package units;

import java.util.ArrayList;

public class Rogue extends Heroes {
    public Rogue(String name, int x, int y) {
        super(-1, name, 8, 3, 2, 4, 10, 6, x, y);
    }


    @Override
    public String getInfo() {
        return "Rouge " + name;
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
        return "Rogue{" +
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
