package units;

public class Monk extends Enchanter {
    public Monk(int attack, int defense, int damage, int health, int speed, int growth, int magicPoint) {
        super(12, 7, 12, 30, 5, 3, 2);
    }

    @Override
    public String toString() {
        return "Monk {" +
                "healingPoint = " + healingPoint +
                ", attack = " + attack +
                ", defense = " + defense +
                ", damage = " + damage +
                ", health = " + health +
                ", speed = " + speed +
                ", growth = " + growth +
                '}';
    }
}
