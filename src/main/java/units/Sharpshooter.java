package units;

public class Sharpshooter extends Shooter {
    int arrow, maxArrow;

    public Sharpshooter(String name) {
        super(name, 12, 10, 10, 15, 9, 4, 2, 32);
        this.arrow = 22;
        this.maxArrow = 32;

    }

    @Override
    public String toString() {
        return "Sharpshooter{" +
                "arrow=" + arrow +
                ", maxArrow=" + maxArrow +
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
        return "Sharpshooter " + name;
    }

    @Override
    public void step() {

    }
}
