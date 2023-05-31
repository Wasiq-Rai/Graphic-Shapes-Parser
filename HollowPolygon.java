//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

// Abstract class that defines all hollow polygons

class HollowPolygon extends Polygon_ {
    private int vertexCount;
    private Color color;
    private int[] xCoords;
    private int[] yCoords;

    // Constructor that calls super constructor

    public HollowPolygon(Color color, int vertexCount,  int[] xCoords, int[] yCoords) {
        super(color, vertexCount);
        this.color = color;
        this.vertexCount = vertexCount;
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }
    @Override
    void drawPolygon(Graphics graphics) {
        graphics.setColor(color);
        graphics.drawPolygon(xCoords, yCoords, vertexCount);
    }
}
