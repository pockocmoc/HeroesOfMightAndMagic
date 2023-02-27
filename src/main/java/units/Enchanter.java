package units;

public class Enchanter extends Healers {
    public Enchanter(String name, int x, int y) {
        super(name, 17, 12, -5, -5, 30, 30,
                9, x, y, 10, 10);
    }


    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Enchanter";
        String name = Enchanter.super.name;
        String attacks = String.format("AT: %d", Enchanter.super.attack);
        String hp = String.format("HP: %d", Enchanter.super.hp);
        String mp = String.format("MP: %d", Enchanter.super.magicPoints);
        double x = Enchanter.super.coords.posX;
        double y = Enchanter.super.coords.posY;
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
        return "Enchanter" + name + " " + hp;
    }


}
