package units;

public class Monk extends Healers {
    public Monk(String name, int x, int y) {
        super(name, 12, 7, -4, -4, 30, 30,
                5, x, y, 5, 10);
    }


    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Monk";
        String name = Monk.super.name;
        String attacks = String.format("AT: %d", Monk.super.attack);
        String hp = String.format("HP: %d", Monk.super.hp);
        String mp = String.format("MP: %d", Monk.super.magicPoints);
        double x = Monk.super.coords.x();
        double y = Monk.super.coords.y();
        String coordinates = String.format("X,Y(%.1f, %.1f)", x, y);
        return String.format(format, type, name, attacks, hp, mp, coordinates);
    }

    @Override
    public void step() {

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHP() {
        return hp;
    }


    @Override
    public String toString() {
        return "Monk" + name + " " + hp;
    }

}

