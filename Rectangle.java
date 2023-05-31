//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

// Class that defines a hollow rectangle object

class Rectangle extends HollowPolygon {

    public Rectangle(Color color, Point upperLeft, int height, int width) {
        super(color, 4,new int[]{upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x},new int[]{upperLeft.y, upperLeft.y, upperLeft.y + height, upperLeft.y + height});
        // int[] x_points = {upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x};
        // int[] y_points = {upperLeft.y, upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        // createPolygon(x_points, y_points);
    }

}
