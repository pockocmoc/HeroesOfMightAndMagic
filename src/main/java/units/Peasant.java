package units;

public class Peasant extends Heroes implements InGameInterface {
    boolean arrow;
    String name;

    public Peasant(String name, boolean arrow) {
        super(1, 1, 1, 1, 3, 25);
        this.arrow = true;
        this.name = name;
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
        return "Peasant " + name ;
    }

    @Override
    public void info() {

    }
}
