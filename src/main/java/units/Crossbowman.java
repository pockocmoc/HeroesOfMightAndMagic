package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name) {
        super(name, 4, 11, 3, 10, 2, 16, 2, 32);
    }


    @Override
    public String toString() {
        return "Crossbowman{" +
                "arrows=" + arrows +
                ", maxArrows=" + maxArrows +
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
        return "Crossbowman " + name;
    }

    @Override
    public void step() {

    }
}
