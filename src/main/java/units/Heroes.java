package units;

import java.util.ArrayList;

public abstract class Heroes implements InGameInterface {
    protected Vector2D vector2D;
    protected String name;
    protected int attack;
    protected int defense;
    protected int minDamage;
    protected int maxDamage;
    protected int health;
    protected int speed;

    // найти ближайшего
    protected int findIndex(ArrayList<Heroes> enemy) {
        for (Heroes h : enemy) {
            h.vector2D.findHeroes();

        }

    }


    public Heroes(String name, int attack, int defense, int minDamage, int maxDamage,
                  int health, int speed, int x, int y) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.vector2D = new Vector2D(x, y);
    }

}

