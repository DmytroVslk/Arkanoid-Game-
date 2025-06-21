package game;

public class Brick extends BaseObject {
    // Matrix — visual representation of the brick
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    //Constructor
    public Brick(double x, double y) {
        super(x, y, 3);
    }

    // Draws the brick using the matrix
    @Override
    void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'H');
    }

    // Bricks don't move
    @Override
    void move() {
        //do nothing
    }
}

