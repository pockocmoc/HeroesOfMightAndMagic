package units;

import java.util.ArrayList;

public abstract class Shooter extends Heroes {
    protected int shotsInOneMove;
    protected int maxArrows;


    public Shooter(String name, int attack, int defense,
                   int minDamage, int maxDamage, int health, int speed, int x, int y,
                   int shotsInOneMove, int maxArrows) {
        super(name, attack, defense, minDamage, maxDamage, health, speed, x, y);
        this.shotsInOneMove = shotsInOneMove;
        this.maxArrows = maxArrows;
    }

    @Override
    public void step(ArrayList<Heroes> teamOne, ArrayList<Heroes> teamTwo) {

    }
}
