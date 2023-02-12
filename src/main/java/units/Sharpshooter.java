package units;

public class Sharpshooter extends Heroes{
    int arrow;

    public Sharpshooter(int attack, int defense, int damage, int health, int speed, int growth, int arrow) {
        super(12, 10, 10, 15, 9, 4);
        this.arrow = 32;

    }

    @Override
    public String toString() {
        return "Sharpshooter {" +
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
