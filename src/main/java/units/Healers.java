package units;

public abstract class Healers extends Heroes {
    int restoreHealthPoints;

    public Healers(String name, int attack, int defense, int damage, int health, int speed,
                   int growth, int restoreHealthPoints) {
        super(name, attack, defense, damage, health, speed, growth);
        this.restoreHealthPoints = restoreHealthPoints;
    }

}
