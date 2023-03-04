package units;

import java.util.ArrayList;

public abstract class Warrior extends Heroes {

    public Warrior(String name, int attack, int defense, int minDamage, int maxDamage,
                   int hp, int maxHp, int speed, int x, int y) {
        super(name, attack, defense, minDamage, maxDamage, hp, maxHp, speed, x, y);
    }

    @Override
    public String getInfo() {
        return getClass().getSimpleName() + " " + state;
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (state.equals("Die")) return;
        Heroes victim = team2.get(findNearest(team2));
        if (victim.coords.getDistance(coords) < 2) {
            float damage = (victim.defense - attack) > 0 ? minDamage :
                    (victim.defense - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            victim.getDamage(damage);

        } else {
            Vector2D temp = coords.chooseWay(victim.coords);
            if (Math.abs(temp.posX) < Math.abs(temp.posY)) {
                if (coords.chooseWay(victim.coords).posY > 0) {
                    coords.posY--;
                } else {
                    coords.posY++;
                }
            } else {
                if (coords.chooseWay(victim.coords).posX > 0) {
                    coords.posX--;
                } else {
                    coords.posX++;
                }

            }
        }
    }
}
