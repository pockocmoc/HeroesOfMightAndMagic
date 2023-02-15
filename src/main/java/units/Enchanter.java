package units;

public class Enchanter extends Healers {
    public Enchanter(String name) {
        super(name, 17, 12, 14, 30, 9,
                2, 3);
    }

    @Override
    public String toString() {
        return "Enchanter{" +
                "restoreHealthPoints=" + restoreHealthPoints +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", damage=" + damage +
                ", health=" + health +
                ", speed=" + speed +
                ", growth=" + growth +
                '}';
    }

    @Override
    public String getInfo() {
        return "Enchanter " + name;
    }

    @Override
    public void step() {

    }
}
