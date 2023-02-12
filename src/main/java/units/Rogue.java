package units;

public class Rogue extends Heroes {


    public Rogue(int attack, int defense, int damage, int health, int growth, int speed) {
        super(8, 3, 4, 10, 6, 8);

    }

    @Override
    public String toString() {
        return "Rogue {" +
                "attack = " + attack +
                ", defense = " + defense +
                ", damage = " + damage +
                ", health = " + health +
                ", speed = " + speed +
                ", growth = " + growth +
                '}';
    }
}
