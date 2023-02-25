package units;

public class Sharpshooter extends Shooter {
    public Sharpshooter(String name, int x, int y) {
        super(name, 12, 10, 8, 10, 15, 15, 9, x, y,
                2, 32);
    }

    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Sharpshooter";
        String name = Sharpshooter.super.name;
        String attacks = String.format("AT: %d", Sharpshooter.super.attack);
        String hp = String.format("HP: %d", Sharpshooter.super.hp);
        String arrows = String.format("Arrows: %d", Sharpshooter.super.maxArrows);
        double x = Sharpshooter.super.coords.x();
        double y = Sharpshooter.super.coords.y();
        String coordinates = String.format("X,Y(%.1f, %.1f)", x, y);
        return String.format(format, type, name, attacks, hp, arrows, coordinates);
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
        return "Sharpshooter" + name + " " + hp;
    }


}
