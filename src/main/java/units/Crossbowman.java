package units;

public class Crossbowman extends Sharpshooter {
    public Crossbowman(int attack, int defense, int damage, int health, int speed, int growth, int arrow) {
        super(4, 11, 3, 10, 2, 16, 10);
    }

    @Override
    public String toString() {
        return "Crossbowman {" +
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
