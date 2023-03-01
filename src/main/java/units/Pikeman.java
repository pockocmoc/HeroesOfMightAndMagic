package units;

import java.util.ArrayList;

public class Pikeman extends Heroes {
    public Pikeman(String name, int x, int y) {
        super(name, 4, 5, 1, 3, 10, 10, 4, x, y);
    }


    @Override
    public String getInfo() {
        String format = "| %-15s | %-10s | %-12s | %-10s | %-10s | %-15s |%n";
        String type = "Pikeman";
        String name = Pikeman.super.name;
        String attacks = String.format("AT: %d", Pikeman.super.attack);
        String hp = String.format("HP: %d", Pikeman.super.hp);
        double x = Pikeman.super.coords.posX;
        double y = Pikeman.super.coords.posY;
        String coordinates = String.format("X,Y(%.1f, %.1f)", x, y);
        return String.format(format, type, name, attacks, hp, "", coordinates);
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2) {
        if (!state.equals("Die")) {
            state = "Stand";

        }
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
