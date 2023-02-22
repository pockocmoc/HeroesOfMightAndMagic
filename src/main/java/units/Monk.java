package units;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(String name, int x, int y) {
        super(name, 12, 7, -4, -4, 30, 5, x, y, 1);
    }



    @Override
    public String getInfo() {
        return "Monk " + name;
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
    public void step(ArrayList<Heroes> teamOne, ArrayList<Heroes> teamTwo) {

    }

    @Override
    public String toString() {
        return "Monk{" +
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

