package units;

public abstract class Heroes implements InGameInterface{
    protected int attack;
    protected int defense;
    protected int damage;
    protected int health;
    protected int speed;
    protected int growth;

    public Heroes(int attack, int defense, int damage, int health, int speed, int growth) {
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Heroes {" +
                "attack = " + attack +
                ", defense = " + defense +
                ", damage = " + damage +
                ", health = " + health +
                ", speed = " + speed +
                ", growth = " + growth +
                '}';
    }
}
