//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

class Parallelogram extends SolidPolygon {

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
     super(color,4,(new int[]{upperLeft.x, upperLeft.x + offset, lowerRight.x + offset, lowerRight.x}),(new int[]{upperLeft.y, lowerRight.y, lowerRight.y, upperLeft.y}));
    } //constructor

} //Parallelogram class
