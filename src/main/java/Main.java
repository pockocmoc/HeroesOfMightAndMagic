import units.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********************");

        ArrayList<Heroes> brightSide = new ArrayList<>();
        ArrayList<Heroes> darkSide = new ArrayList<>();
        List<Heroes> allHeroes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(0, 4)) {
                case 0 -> brightSide.add(new Peasant(getName(), i + 1, 0));
                case 1 -> brightSide.add(new Pikeman(getName(),i + 1, 0));
                case 2 -> brightSide.add(new Crossbowman(getName(),i + 1, 0));
                case 3 -> brightSide.add(new Monk(getName(),i + 1, 0));
            }

        }
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(0, 4)) {
                case 0 -> darkSide.add(new Peasant(getName(),9, i + 1));
                case 1 -> darkSide.add(new Rogue(getName(),9, i + 1));
                case 2 -> darkSide.add(new Sharpshooter(getName(),9, i + 1));
                case 3 -> darkSide.add(new Enchanter(getName(),9, i + 1));
            }

        }
        allHeroes.addAll(brightSide);
        allHeroes.addAll(darkSide);


        allHeroes.sort((o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed()) return o2.getHP() - o1.getHP();
            return o2.getSpeed() - o1.getSpeed();
        });

        brightSide.forEach(n -> System.out.println(n.getInfo() + " скорость, " + n.getSpeed()));
        System.out.println("***********************");
        darkSide.forEach(n -> System.out.println(n.getInfo() + " скорость, " + n.getSpeed()));
        System.out.println("***********************");
        allHeroes.forEach(n -> System.out.println(n.getInfo() + " скорость, " + n.getSpeed()));
        System.out.println("***********************");

        allHeroes.forEach(n -> System.out.println(n.getFullInfo()));
        System.out.println(allHeroes.size());





        System.out.println("___Очередь для хода___");
        allHeroes.forEach(n -> n.step(brightSide, darkSide));


    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }


}
