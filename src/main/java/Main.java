import units.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Peasant peasantOne = new Peasant( "Vasya",true);



        System.out.println(peasantOne);

        System.out.println("***********************");
        List<Heroes> list = new ArrayList<>();
        list.add(new Peasant("Oleg",true));
        list.forEach(n -> System.out.println(n.getInfo()));

    }
}
