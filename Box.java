import java.awt.*;
import java.io.Serializable;

/*
 *
 * Box  - The original question class that also has the answer locations as properties and has a draw(g) method itself
 *
 * @author: Group 1E    ( 21100664 Caner Bozkurt - 21201718 Atila Orhon - Yasemin Beg�m Pirin�) 22.04.2013
 *
 */
 
public class Box implements Serializable
{
	/**
	 * 
	 */
	public int x;
	public int y;
	public int w;
	public int h;
	public Point answer;
	public boolean selected;
	public String title;
	public boolean answerFull;

	
	
	public Box(int x, int y, int w, int h, Point p, String title) {
		super();
		answer = p;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.title = title;
		selected = false;
		answerFull = false;
		
	}
	
	public void draw (Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawRect(x, y, w, h);
		
		g.setColor(Color.WHITE);
		g.drawRect(this.getaX(), this.getaY(), w, h);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Arial", Font.BOLD, 15));
		g.drawString(this.title, this.getX() + 15, this.getY() + 27);
		
	
		
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean getSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public int getaX()
	{
		return (int)answer.getX();
	}
	
	public int getaY()
	{
			return (int)answer.getY();
	}
	
	public boolean contains(int x, int y)
	{
		if( ( x >= this.x) && ( x <= this.x+w) && ( y >= this.y) && ( y <= this.y+h))
		{
			selected = true;
			return true;
		}	
		selected = false;
		return false;
		
	}
	
	
	
	
	
	

}
