package units;

public class Enchanter extends Heroes {
    int healingPoint;

    public Enchanter(int attack, int defense, int damage, int health, int speed, int growth, int healingPoint) {
        super(17, 12, 14, 30, 9, 2);
        this.healingPoint = 2;

    }

    @Override
    public String toString() {
        return "Enchanter {" +
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
