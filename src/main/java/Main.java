import units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********************");
        List<Heroes> list = new ArrayList<>();
        list.add(new Peasant(getName()));
        list.add(new Monk(getName()));
        list.add(new Enchanter(getName()));
        list.add(new Sharpshooter(getName()));
        list.add(new Crossbowman(getName()));
        list.add(new Rogue(getName()));
        list.add(new Pikeman(getName()));
        list.add(new Peasant(getName()));
        list.add(new Rogue(getName()));
        list.add(new Enchanter(getName()));
        list.forEach(n -> System.out.println(n.getInfo()));
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
