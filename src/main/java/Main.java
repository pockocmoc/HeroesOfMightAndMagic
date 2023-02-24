import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********************");

        ArrayList<Heroes> brightSide = new ArrayList<>();
        ArrayList<Heroes> darkSide = new ArrayList<>();
        ArrayList<Heroes> allHeroes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(0, 4)) {
                case 0 -> brightSide.add(new Farmer(getName(), i + 1, 0));
                case 1 -> brightSide.add(new Pikeman(getName(), i + 1, 0));
                case 2 -> brightSide.add(new Crossbowman(getName(), i + 1, 0));
                case 3 -> brightSide.add(new Monk(getName(), i + 1, 0));
            }

        }
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(0, 4)) {
                case 0 -> darkSide.add(new Peasant(getName(), 9, i + 1));
                case 1 -> darkSide.add(new Rogue(getName(), 9, i + 1));
                case 2 -> darkSide.add(new Sharpshooter(getName(), 9, i + 1));
                case 3 -> darkSide.add(new Enchanter(getName(), 9, i + 1));
            }

        }
        allHeroes.addAll(brightSide);
        allHeroes.addAll(darkSide);

        SortByParameter.MySorting(allHeroes);

        brightSide.forEach(n -> System.out.println(n.getInfo() + " скорость, " + n.getSpeed()));
        System.out.println("***********************");
        darkSide.forEach(n -> System.out.println(n.getInfo() + " скорость, " + n.getSpeed()));
        System.out.println("***********************");
        allHeroes.forEach(n -> System.out.println(n.getInfo() + " скорость, " + n.getSpeed()));
        System.out.println("***********************");

        allHeroes.forEach(n -> System.out.println(n.getFullInfo()));


        Heroes nearestEnemy = Heroes.findNearestEnemy(allHeroes);
        assert nearestEnemy != null;
        System.out.println("Ближайшийм противником для " + allHeroes.get(0).getInfo() +
                ", является " + nearestEnemy.getInfo());



    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }


}
