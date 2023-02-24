package units;

import java.util.ArrayList;
import java.util.List;

import static java.awt.geom.Point2D.distance;

public abstract class Heroes implements InGameInterface {
    protected int sideOfTheConflict;
    protected Vector2D vector2D;
    protected String name;
    protected int attack;
    protected int defense;
    protected int minDamage;
    protected int maxDamage;
    protected int health;
    protected int speed;

    public static Heroes findNearestEnemy(Heroes currentHeroes, List<Heroes> allHeroes, double targetX, double targetY) {
        Heroes nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;
        for (Heroes hero : allHeroes) {
            if (hero.getSideOfTheConflict() != currentHeroes.getSideOfTheConflict()) {
                double distance = distance(hero.vector2D.getX(), hero.vector2D.getY(), targetX, targetY);
                if (distance < minDistance) {
                    nearestEnemy = hero;
                    minDistance = distance;
                }
            }
        }
        return nearestEnemy;
    }


    public static Heroes findNearestEnemy(ArrayList<Heroes> allHeroes) {
        if (allHeroes.size() < 2) {
            return null;
        }
        Heroes firstHero = allHeroes.get(0);
        double targetX = firstHero.vector2D.getX();
        double targetY = firstHero.vector2D.getY();
        return findNearestEnemy(firstHero, allHeroes.subList(1, allHeroes.size()), targetX, targetY);
    }


    public Heroes(int sideOfTheConflict, String name, int attack, int defense,
                  int minDamage, int maxDamage, int health, int speed, int x, int y) {
        this.sideOfTheConflict = sideOfTheConflict;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.vector2D = new Vector2D(x, y);

    }

    public Vector2D getVector2D() {
        return vector2D;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public int getSideOfTheConflict() {
        return sideOfTheConflict;
    }

    protected int takeDamage(int damage) {
        return getHP() - damage;
    }
}

