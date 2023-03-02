package units;

import java.util.ArrayList;

public abstract class Heroes implements InGameInterface {
    protected Vector2D coords;
    protected String name;
    protected int attack;
    protected int defense;
    protected int minDamage;
    protected int maxDamage;
    protected int hp;
    protected int maxHp;
    protected int speed;
    protected String state;

    public int[] getCoords() {
        return new int[]{coords.posX, coords.posY};
    }

    public Heroes(String name, int attack, int defense,
                  int minDamage, int maxDamage, int hp, int maxHp, int speed, int x, int y) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        coords = new Vector2D(x, y);
        state = "Stand";

    }

    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
    }

    protected int findNearest(ArrayList<Heroes> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > coords.getDistance(team.get(i).coords) && !team.get(i).state.equals("Die")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }

        }
        return index;
    }


    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " " +
                state;
    }


}

