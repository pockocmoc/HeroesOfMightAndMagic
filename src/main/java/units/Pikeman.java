package units;

public class Pikeman extends Rogue {

    public Pikeman(int attack, int defense, int damage, int health, int speed, int growth) {
        super(4, 5, 3, 10, 4, 14);

    }

    @Override
    public String toString() {
        return "Pikeman {" +
                "attack = " + attack +
                ", defense = " + defense +
                ", damage = " + damage +
                ", health = " + health +
                ", speed = " + speed +
                ", growth = " + growth +
                '}';
    }
}
