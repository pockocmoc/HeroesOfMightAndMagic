package units;

import java.util.ArrayList;

public abstract class Healers extends Heroes {
    protected int magicPoints;
    protected int maxMP;


    public Healers(String name, int attack, int defense, int minDamage, int maxDamage,
                   int hp, int maxHp, int speed, int x, int y, int magicPoints, int maxMP) {
        super(name, attack, defense, minDamage, maxDamage, hp, maxHp, speed, x, y);
        this.magicPoints = magicPoints;
        this.maxMP = maxMP;
    }

    protected Heroes findVeryIll(ArrayList<Heroes> team) {
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (minHp > team.get(i).maxHp - team.get(i).hp && !state.equals("Die")) {
                index = i;
                minHp = team.get(i).maxHp - team.get(i).hp;
            }

        }
        return team.get(index);
    }
    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (state.equals("Die") || magicPoints <= 0) return;
        Heroes victim = findVeryIll(team1);
        victim.getDamage(maxDamage);
        magicPoints -= 1;
    }


}
