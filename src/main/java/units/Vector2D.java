package units;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Vector2D opponent) {
        return posX < opponent.posX;
    }

    protected boolean isRight(Vector2D opponent) {
        return posX > opponent.posX;
    }

    protected boolean isUp(Vector2D opponent) {
        return posY < opponent.posY;
    }

    protected boolean isDown(Vector2D opponent) {
        return posY > opponent.posY;
    }

    protected double getDistance(Vector2D opponent) {
        return Math.sqrt(Math.pow(posX - opponent.posX, 2) + Math.pow(posY - opponent.posY, 2));
    }

    protected Vector2D chooseWay(Vector2D opponent) {
        return new Vector2D(posX - opponent.posX, posY - opponent.posY);
    }
}
