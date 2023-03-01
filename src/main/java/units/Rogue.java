package units;

public class Rogue extends Heroes {
    public Rogue(String name, int x, int y) {
        super(name, 8, 3, 2, 4, 10, 10, 6, x, y);
    }

    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Rogue";
        String name = Rogue.super.name;
        String attacks = String.format("AT: %d", Rogue.super.attack);
        String hp = String.format("HP: %d", Rogue.super.hp);
        double x = Rogue.super.coords.posX;
        double y = Rogue.super.coords.posY;
        String coordinates = String.format("X,Y(%.1f, %.1f)", x, y);
        return String.format(format, type, name, attacks, hp, "", coordinates);
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


}
