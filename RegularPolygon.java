//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

class RegularPolygon extends SolidPolygon {
    public RegularPolygon(Color color, int sides, Point center, int radius) {
        super(color,6,computeXCoords(center, radius, sides),computeYCoords(center, radius, sides));
    }

    private static int[] computeXCoords(Point center, int radius, int sides) {
        int[] xCoords = new int[sides];
        double angle = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            xCoords[i] = (int) (center.x + radius * Math.cos(i * angle));
        }
        return xCoords;
    }

    private static int[] computeYCoords(Point center, int radius, int sides) {
        int[] yCoords = new int[sides];
        double angle = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            yCoords[i] = (int) (center.y + radius * Math.sin(i * angle));
        }
        return yCoords;
    }
}
