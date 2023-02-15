package units;

public class Rogue extends Heroes {
    public Rogue(String name) {
        super(name, 8, 3, 4, 10, 6, 8);
    }


    @Override
    public String toString() {
        return "Rogue{" +
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
        return "Rouge " + name;
    }

    @Override
    public void step() {

    }
}
