
/**
 * @author Sam Kauffman
 *
 */
public class circle {
	private double radius;
	
		/**
		 * initializes radius to 0
		 */
		public circle() {
			radius = 0;
		}
		/**
		 * @param radius
		 * @return
		 */
		public double getRadius() {
			return radius;
		}
		/**
		 * @param radius
		 */
		public void setRadius(double radius) {
			this.radius = radius;
		}
		/**
		 * @return the area of a circle by using pi r squared
		 */
		public double area() {
			return Math.PI*Math.pow(radius, 2);
		}
	}

