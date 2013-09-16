/**Class Rectangle has coordinates ,width and height of a rectangle.
 * It has three constructors which can which be intialized in three diff ways.
 * One takes four arguments,the other no arguments and the third three arguments
 * @author Sarwar
 */
public class Rectangle {
	
	private int x, y, width, height;
	
	

	public Rectangle(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle()
	{
		this(0,0,0,0);
	}

	public Rectangle(int x, int y, int height)
	{
		this(x,y,height,height);
	}

	public void setHeight(int height)
	{	
		this.height=height;
		
		
	}

	public void setWidth(int width)
	{
		this.width = width;
		
	}

	public int getHeight()
	{
		return this.height;
	}

	public int getWidth()
	{
		return this.width;
	}

	public void Translate(int a, int b)
	{
		this.x += a;
		this.y += b;
	}


	
	
	
}
