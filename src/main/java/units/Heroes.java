package units;

public abstract class Heroes implements InGameInterface {
    protected String name;
    protected int attack;
    protected int defense;
    protected int minDamage;
    protected int maxDamage;
    protected int health;
    protected int speed;


    public Heroes(String name, int attack, int defense, int minDamage, int maxDamage,
                  int health, int speed) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
    }
}

