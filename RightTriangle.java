//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

// Class that defines a hollow right triangle

class RightTriangle extends HollowPolygon {

    // Constructor that initializes the vertices of the right triangle

    public RightTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3,new int[]{upperLeft.x, upperLeft.x, upperLeft.x + width},new int[]{upperLeft.y, upperLeft.y + height, upperLeft.y + height});

        // int[] x_points = {upperLeft.x, upperLeft.x, upperLeft.x + width};
        // int[] y_points = {upperLeft.y, upperLeft.y + height, upperLeft.y + height};

        // createPolygon(x_points, y_points);
    }

}
