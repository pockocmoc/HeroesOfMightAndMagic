package units;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }


    protected double getDistance(Vector2D opponent) {
        return Math.sqrt(Math.pow(posX - opponent.posX, 2) + Math.pow(posY - opponent.posY, 2));
    }

    protected Vector2D chooseWay(Vector2D opponent) {
        return new Vector2D(posX - opponent.posX, posY - opponent.posY);
    }
}
