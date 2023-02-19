package units;

public abstract class Healers extends Heroes {
    protected int magicPoints;

    public Healers(String name, int attack, int defense,
                   int minDamage, int maxDamage, int health, int speed, int magicPoints) {
        super(name, attack, defense, minDamage, maxDamage, health, speed);
        this.magicPoints = magicPoints;
    }
}
