package units;

public class Monk extends Healers {
    public Monk(String name) {
        super(name, 12, 7, 12, 30, 5, 3, 2);
    }

    @Override
    public String toString() {
        return "Monk{" +
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
        return "Monk " + name;
    }

    @Override
    public void step() {

    }

}

