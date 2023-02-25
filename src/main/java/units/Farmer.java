package units;

import java.util.ArrayList;

public class Farmer extends Heroes {

    protected int deliveryOfArrows;

    public Farmer(String name, int x, int y) {
        super(name, 1, 1, 1, 1, 1, 1, 3, x, y);
        this.deliveryOfArrows = 1;
    }


    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Farmer";
        String name = Farmer.super.name;
        String attacks = String.format("AT: %d", Farmer.super.attack);
        String hp = String.format("HP: %d", Farmer.super.hp);
        String arrows = String.format("Arrows: %d", Farmer.this.deliveryOfArrows);
        double x = Farmer.super.coords.x();
        double y = Farmer.super.coords.y();
        String coordinates = String.format("X,Y(%.1f, %.1f)", x, y);
        return String.format(format, type, name, attacks, hp, arrows, coordinates);
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (!state.equals("Die")) state = "Stand";

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
        return "Peasant" + name + " " + hp;
    }


}
