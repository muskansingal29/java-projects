package Oops2;

public class Rectangle extends Square implements Shape
	{
	public int width=3;
		
		@Override
		public int area()
		{
			int ar=width*3;
			return ar;
		}
		
		
	
}
