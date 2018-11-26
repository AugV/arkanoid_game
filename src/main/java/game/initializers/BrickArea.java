package game.initializers;

import static game.parameters.Parameters.brickAreasLowerBorderYcoord;
import static game.parameters.Parameters.brickAreasUpperBorderYcoord;

public class BrickArea {
    private double lowerY, upperY, leftX, rightX, width, height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public BrickArea() {
    }

    public BrickArea(double screenWidth, double screenHeight){
        lowerY = calculateLowerY(screenHeight);
        upperY = calculateUpperY(screenHeight);
        leftX = 0.0;
        rightX = screenWidth;
        width = rightX - leftX;
        height = lowerY - upperY;
    }

    public double calculateUpperY(double screenHeight) {
        return screenHeight/brickAreasUpperBorderYcoord;
    }

    public double calculateLowerY(double screenHeight) {
        return screenHeight/brickAreasLowerBorderYcoord;
    }

    public double getLowerY() {
        return lowerY;
    }

    public double getUpperY() {
        return upperY;
    }

    public double getLeftX() {
        return leftX;
    }

    public double getRightX() {
        return rightX;
    }
}
