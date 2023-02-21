package units;

public class Vector2D {
    private int x;
    private int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // расчет расстояния
    protected int findHeroes(Vector2D vector2D) {
        int x = vector2D.x;
        int y = vector2D.y;

        double l1 = Math.sqrt((x - this.x) *(x - this.x) + ((y - this.y)*(y - this.y)));
        return (int) l1;
    }
}
