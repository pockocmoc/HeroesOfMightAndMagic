package units;

import java.util.ArrayList;

public abstract class Shooter extends Heroes {
    protected int shotsInOneMove;
    protected int maxArrows;

    public Shooter(String name, int attack, int defense, int minDamage, int maxDamage,
                   int hp, int maxHp, int speed, int x, int y, int shotsInOneMove, int maxArrows) {
        super(name, attack, defense, minDamage, maxDamage, hp, maxHp, speed, x, y);
        this.shotsInOneMove = shotsInOneMove;
        this.maxArrows = maxArrows;
    }


    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (state.equals("Die") || maxArrows == 0) return;
        Heroes victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack) > 0 ? minDamage :
                (victim.defense - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        victim.getDamage(damage);
        for (Heroes heroes : team1) {
            if ((heroes.getInfo().split(":")[0].equals("Peasant")
                    || heroes.getInfo().split(":")[0].equals("Farmer"))
                    && heroes.state.equals("Stand")) {
                heroes.state = "Busy";
                return;
            }
        }
        maxArrows--;

    }
}
