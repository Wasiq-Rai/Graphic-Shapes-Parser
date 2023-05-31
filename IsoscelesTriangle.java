//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

class IsoscelesTriangle extends SolidPolygon {

    //constructor that is supplied the color of the triangle, a point that specifies the location of the top vertex, 
    //and the height and width of the triangle
    public IsoscelesTriangle(Color color, Point top, int height, int width) {       
     super(color,3,(new int[]{top.x - width / 2, top.x, top.x + width / 2}), (new int[]{top.y, top.y + height, top.y}));
    }



} //IsoscelesTriangle class