package units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x,
                       int y) {
        super(1, name, 6, 3, 2, 3, 10, 4, x, y,
                2, 16);
    }


    @Override
    public String getInfo() {
        return "Crossbowman " + name;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHP() {
        return health;
    }

    @Override
    public String toString() {
        return "Crossbowman{" +
                "shotsInOneMove=" + shotsInOneMove +
                ", maxArrows=" + maxArrows +
                ", vector2D=" + vector2D +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    public String getFullInfo() {
        System.out.println(this);
        return ("");
    }

    public void step() {
        // Проверяем, что у лучника есть жизнь и стрелы
        if (health <= 0 || maxArrows <= 0) {
            return;
        }

//        // Находим ближайшего противника
//
//        Heroes nearestEnemy = findNearestEnemy();
//
//        // Если противник найден, атакуем его
//        if (nearestEnemy != null) {
//            int damage = getMaxDamage();
//            nearestEnemy.takeDamage(damage);
//        } else {
//            // Если противник не найден, ищем ближайшего крестьянина
////            Heroes nearestAlly = findNearestAlly(allies);
//            ArrayList<Heroes> Farmer = null;
//            Heroes nearestAlly = findNearestEnemy(Farmer);
//
//            // Если крестьянин найден, двигаемся к нему
//            if (nearestAlly != null) {
//
//            } else {
//                // Если крестьянин не найден, уменьшаем количество стрел на 1
//                arrowsCount--;
//            }
//        }
//    }
//
//    private Heroes findNearestEnemy() {
//    }


    }
}
