import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int UNITS = 10;
    public static ArrayList<Heroes> brightTeam = new ArrayList<>();
    public static ArrayList<Heroes> darkTeam = new ArrayList<>();
    public static ArrayList<Heroes> allHeroesTeam = new ArrayList<>();

    public static void main(String[] args) {

        String line = "_________________________________________________________" +
                "__________________________________";
        System.out.println(line);

        Scanner scanner = new Scanner(System.in);
        createTeam(darkTeam, 0, 1);
        createTeam(brightTeam, 3, 10);
        allHeroesTeam.addAll(brightTeam);
        allHeroesTeam.addAll(darkTeam);
        SortByParameter.MySorting(allHeroesTeam);


        for (Heroes heroes : allHeroesTeam) {
            if (brightTeam.contains(heroes)) heroes.step(brightTeam, darkTeam);
            else heroes.step(darkTeam, brightTeam);
        }

        while (true) {
            View.view();
            scanner.nextLine();
            for (Heroes heroes : allHeroesTeam) {
                if (brightTeam.contains(heroes)) heroes.step(brightTeam, darkTeam);
                else heroes.step(darkTeam, brightTeam);
            }
        }


    }

    static void createTeam(ArrayList<Heroes> team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int random = new Random().nextInt(4) + offset;
            switch (random) {
                case (0) -> team.add(new Enchanter(getName(), i + 1, posY));
                case (1) -> team.add(new Sharpshooter(getName(), i + 1, posY));
                case (2) -> team.add(new Rogue(getName(), i + 1, posY));
                case (3) -> team.add(new Farmer(getName(), i + 1, posY));
                case (4) -> team.add(new Monk(getName(), i + 1, posY));
                case (5) -> team.add(new Crossbowman(getName(), i + 1, posY));
                case (6) -> team.add(new Pikeman(getName(), i + 1, posY));
            }
        }
    }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }


}
