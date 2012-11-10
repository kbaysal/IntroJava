public abstract class AbstractShape {

	int width;
	int height;

	public int getArea(){
		return width*height;
	}

	abstract public boolean doMagic();

}
