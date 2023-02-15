package units;

public abstract class Shooter extends Heroes {
    int arrows, maxArrows;

    public Shooter(String name, int attack, int defense, int damage, int health, int speed, int growth,
                   int arrows, int maxArrows) {
        super(name, attack, defense, damage, health, speed, growth);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
    }
}
