package units;

public abstract class Heroes implements InGameInterface {
    protected String name;
    protected int attack;
    protected int defense;
    protected int damage;
    protected int health;
    protected int speed;
    protected int growth;


    public Heroes(String name, int attack, int defense, int damage, int health, int speed, int growth) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.growth = growth;
    }

}

