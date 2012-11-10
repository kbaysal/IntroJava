public class Rectangle implements Shape, ShapeCopy{
	int height;
	int width;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public static boolean doesIntersect(Rectangle rect1, Rectangle rect2) {
		return true;
	}

	public boolean doMagic() {
		return this.magic();
	}

	private boolean magic() {
		return true;
	}
	
	public int getArea() {
		return this.width*this.height;
	}
}
