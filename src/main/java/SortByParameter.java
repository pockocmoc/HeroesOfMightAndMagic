import units.Heroes;

import java.util.ArrayList;

public class SortByParameter {

    static ArrayList<Heroes> MySorting(ArrayList<Heroes> list) {

        list.sort((o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed())
                return o2.getHP() - o1.getHP();
            return o2.getSpeed() - o1.getSpeed();
        });

        return list;
    }
}