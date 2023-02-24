package units;

public class Vector2D {
    private int x;
    private int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected int findHeroes(Vector2D vector2D) {
        int x = vector2D.x;
        int y = vector2D.y;

        return (int) Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
