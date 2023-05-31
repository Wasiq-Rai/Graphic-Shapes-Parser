//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

class SolidPolygon extends Polygon_ {
    private int vertexCount;
    private Color color;
    private int[] xCoords;
    private int[] yCoords;

    public SolidPolygon(Color color, int vertexCount, int[] xCoords, int[] yCoords) {
        super(color, vertexCount);
        this.color = color;
        this.vertexCount = vertexCount;
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    @Override
    void drawPolygon(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillPolygon(xCoords, yCoords, vertexCount);
        graphics.drawPolygon(xCoords, yCoords, vertexCount);
    }
}


            // draw(graphics);

	// @Override
	// public void createPolygon(int[] x_points, int[] y_points) {
    //     polygon = new Polygon(x_points, y_points, vertexCount);
    // }

	// public void createPolygon(int[] xPoints, int[] yPoints) {
   	// 	polygon = new Polygon(xPoints, yPoints, vertexCount);
	// }

	// @Override
	// public void draw(Graphics graphics) {
	//     graphics.setColor(color);
	//     graphics.fillPolygon(polygon);
	// }
	
	// @Override
    // public void draw(Graphics graphics) {
    //     colorDrawing(graphics);
    //     graphics.drawPolygon(polygon);
    //     graphics.fillPolygon(polygon);
    // }

// } // SolidPolygon class
