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

        Scanner scanner = new Scanner(System.in);
        System.out.println(AnsiColors.ANSI_CYAN + "Press enter to start game!" + AnsiColors.ANSI_RESET);
        scanner.nextLine();
        String lineDown = "_".repeat(100);

        createTeam(darkTeam, 0, 1);
        createTeam(brightTeam, 3, 10);
        allHeroesTeam.addAll(brightTeam);
        allHeroesTeam.addAll(darkTeam);
        SortByParameter.MySorting(allHeroesTeam);


        for (Heroes heroes : allHeroesTeam) {
            if (brightTeam.contains(heroes)) heroes.step(brightTeam, darkTeam);
            else heroes.step(darkTeam, brightTeam);
        }

        boolean isBrightTeamDead = false;
        boolean isDarkTeamDead = false;

        while (!isBrightTeamDead && !isDarkTeamDead) {
            View.view();
            scanner.nextLine();
            for (Heroes heroes : allHeroesTeam) {
                if (brightTeam.contains(heroes)) {
                    heroes.step(brightTeam, darkTeam);
                    if (heroes.getInfo().contains("Die")) {
                        isBrightTeamDead = allHeroesTeam.stream().filter(brightTeam::contains)
                                .allMatch(h -> h.getInfo().contains("Die"));
                    }
                } else {
                    heroes.step(darkTeam, brightTeam);
                    if (heroes.getInfo().contains("Die")) {
                        isDarkTeamDead = allHeroesTeam.stream().filter(darkTeam::contains)
                                .allMatch(h -> h.getInfo().contains("Die"));
                    }
                }
            }
        }
        String winnerTeam = isBrightTeamDead ? "Green side" : "Blue side";
        if (winnerTeam.equals("Green side")) {
            System.out.println(AnsiColors.ANSI_GREEN + "The winner is: " + winnerTeam + AnsiColors.ANSI_RESET);
        } else
            System.out.println(AnsiColors.ANSI_BLUE + "The winner is: " + winnerTeam + AnsiColors.ANSI_RESET);
        System.out.println(lineDown);
        System.out.println(AnsiColors.ANSI_CYAN + "Game over!"
                + AnsiColors.ANSI_RESET);


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
