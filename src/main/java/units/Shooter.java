package units;

public abstract class Shooter extends Heroes {
    protected int shotsInOneMove;
    protected int maxArrows;


    public Shooter(String name, int attack, int defense,
                   int minDamage, int maxDamage, int health, int speed, int shotsInOneMove, int maxArrows) {
        super(name, attack, defense, minDamage, maxDamage, health, speed);
        this.shotsInOneMove = shotsInOneMove;
        this.maxArrows = maxArrows;
    }
}
