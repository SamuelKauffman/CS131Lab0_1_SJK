
/**
 * @author Sam Kauffman
 * @Version 1.0
 * this application uses the classes circle and square to find the radius of
 *  a circle and square with a given a specific radius/side length
 */
public class application {

	public static void main(String[] args) {
		square sides = new square();
		sides.setSide(5);
		circle radius = new circle();
		radius.setRadius(5);
		
		System.out.println("Square area with the length of: " + sides.getSide() + " is "+ sides.area());
		System.out.println("Circle area with the radius of: " + radius.getRadius() + " is " + radius.area());
	}

}
