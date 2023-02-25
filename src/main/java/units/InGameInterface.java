package units;

import java.util.ArrayList;

public interface InGameInterface {
    String getInfo();

    void step();

    void step(ArrayList<Heroes> team1, ArrayList<Heroes> team2);

    int getSpeed();

    int getHP();


}

