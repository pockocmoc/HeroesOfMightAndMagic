package units;

public class Peasant extends Heroes {
    boolean arrow;

    public Peasant(int attack, int defense, int damage, int health, int speed, int growth, boolean arrow) {
        super(1, 1, 1, 1, 3, 25);
        this.arrow = true;
    }

    @Override
    public String toString() {
        return "Peasant {" +
                "arrow = " + arrow +
                ", attack = " + attack +
                ", defense = " + defense +
                ", damage = " + damage +
                ", health = " + health +
                ", speed = " + speed +
                ", growth = " + growth +
                '}';
    }
}
