import java.util.ArrayList;

public class RectArea {

	public static void main(String[] args){		
		Rectangle r = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(3, 5);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		System.out.println(r.getArea());
		System.out.println(r2.getArea());
		if(Rectangle.doesIntersect(r, r2)){
			System.out.println("WOOOO");
		}
	}
}
