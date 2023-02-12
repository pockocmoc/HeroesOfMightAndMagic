import units.*;

public class Main {
    public static void main(String[] args) {
        Peasant peasantOne = new Peasant(1, 1, 1, 1, 3, 25, true);
        Rogue rogueOne = new Rogue(8, 3, 4, 10, 6, 8);
        Pikeman pikemanOne = new Pikeman(4, 5, 3, 10, 4, 14);
        Sharpshooter sharpshooterOne = new Sharpshooter(12, 10, 10, 15,
                9, 4, 12);
        Crossbowman crossbowmanOne = new Crossbowman(4, 11, 3, 10,
                2, 16, 10);
        Enchanter enchanterOne = new Enchanter(17, 12, 14, 30,
                9, 2, 3);
        Monk monkOne = new Monk(12, 7, 12, 30, 5, 3, 2);


        System.out.println(peasantOne);
        System.out.println(rogueOne);
        System.out.println(pikemanOne);
        System.out.println(sharpshooterOne);
        System.out.println(crossbowmanOne);
        System.out.println(enchanterOne);
        System.out.println(monkOne);

    }
}
