package units;

public class Pikeman extends Heroes {
    public Pikeman(String name) {
        super(name, 4, 5, 3, 10, 4, 14);
    }

    @Override
    public String toString() {
        return "Pikeman{" +
                "name='" + name + '\'' +
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
        return "Pikeman " + name;
    }

    @Override
    public void step() {

    }
}
