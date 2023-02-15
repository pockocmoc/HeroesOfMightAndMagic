package units;

public class Peasant extends Heroes {
    boolean arrow;

    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 3, 25);
        this.arrow = true;
    }


    @Override
    public String toString() {
        return "Peasant{" +
                "arrow=" + arrow +
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
        return "Peasant " + name;
    }

    @Override
    public void step() {

    }
}
