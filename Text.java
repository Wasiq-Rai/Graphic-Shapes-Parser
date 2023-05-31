//Javier Arocho
// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

import java.awt.*;

class Text extends Image {

	private Color color;
	private Point point;
	private String str;

	public Text(Color color,Point point,String str){
		super(color);
		this.color = color;
		this.point = point;
		this.str = str;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawString(str, point.x, point.y);
	}

} //Text class