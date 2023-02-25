package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y) {
        super(name, 6, 3, 2, 3, 10, 10, 4, x, y,
                1, 16);
    }


    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Crossbowman";
        String name = Crossbowman.super.name;
        String attacks = String.format("AT: %d", Crossbowman.super.attack);
        String hp = String.format("HP: %d", Crossbowman.super.hp);
        String arrows = String.format("Arrows: %d", Crossbowman.super.maxArrows);
        double x = Crossbowman.super.coords.x();
        double y = Crossbowman.super.coords.y();
        String coordinates = String.format("X,Y(%.1f, %.1f)", x, y);
        return String.format(format, type, name, attacks, hp, arrows, coordinates);
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
        return "Crossbowman " + name + " " + hp;
    }




    public void step() {

    }


}

