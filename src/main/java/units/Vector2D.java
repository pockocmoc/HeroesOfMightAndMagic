package units;

public record Vector2D(int x, int y) {

    int getDistance(Vector2D vector2D) {
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
