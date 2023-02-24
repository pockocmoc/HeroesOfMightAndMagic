package units;

public abstract class Healers extends Heroes {
    protected int magicPoints;


    public Healers(int sideOfTheConflict, String name, int attack, int defense,
                   int minDamage, int maxDamage, int health, int speed, int x, int y) {
        super(sideOfTheConflict, name, attack, defense, minDamage, maxDamage, health, speed, x, y);
    }
}
