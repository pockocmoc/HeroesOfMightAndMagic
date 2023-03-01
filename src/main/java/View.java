import units.*;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") +
            String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") +
            String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") +
            String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");

    private static void tabSetter(int cnt, int max) {
        int dif = max - cnt + 2;
        if (dif > 0) System.out.printf("%" + dif + "s", ":\t");
        else System.out.print(":\t");
    }

    private static String formatDiv(String str) {
        return str.replace('a', '┌')
                .replace('b', '┬')
                .replace('c', '┐')
                .replace('d', '├')
                .replace('e', '┼')
                .replace('f', '┤')
                .replace('g', '└')
                .replace('h', '┴')
                .replace('i', '┘')
                .replace('-', '─');
    }

    private static String getChar(int x, int y) {
        String out = "| ";
        for (Heroes heroes : Main.allHeroesTeam) {
            if (heroes.getCoords()[0] == x && heroes.getCoords()[1] == y) {
                if (heroes.getHP() == 0) {
                    out = "|" + (AnsiColors.ANSI_RED + heroes.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Main.darkTeam.contains(heroes)) out = "|" + (AnsiColors.ANSI_GREEN + heroes.getInfo().charAt(0) +
                        AnsiColors.ANSI_RESET);
                if (Main.brightTeam.contains(heroes)) out = "|" + (AnsiColors.ANSI_BLUE + heroes.getInfo().charAt(0) +
                        AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }

    public static void view() {
        if (step == 1) {
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.allHeroesTeam.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        System.out.print("_".repeat(l[0] * 2));
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print("Green side");
        System.out.print(" ".repeat(l[0] - 10));
        System.out.println(":\tBlue side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(Main.darkTeam.get(0));
        tabSetter(Main.darkTeam.get(0).toString().length(), l[0]);
        System.out.println(Main.brightTeam.get(0));
        System.out.println(midl10);

        for (int i = 2; i < 9; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(Main.darkTeam.get(i - 1));
            tabSetter(Main.darkTeam.get(i - 1).toString().length(), l[0]);
            System.out.println(Main.brightTeam.get(i - 1));
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(Main.darkTeam.get(9));
        tabSetter(Main.darkTeam.get(9).toString().length(), l[0]);
        System.out.println(Main.brightTeam.get(9));
        System.out.println(bottom10);
    }
}