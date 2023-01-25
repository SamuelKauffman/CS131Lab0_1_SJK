
/**
 * @author Sam Kauffman
 *
 */
public class square {
	private double mSide;
		/**
		 * initializes mSides to 0
		 */
		public square() {
			mSide = 0;
		}
		/**
		 * @param side
		 * @return
		 */
		public double getSide() {
			return mSide;
		}
		/**
		 * @param side
		 */
		public void setSide(double side) {
			mSide=side;
		}
		/**
		 * @return mSide squared to get the area
		 */
		public double area() {
			return Math.pow(mSide, 2);
		}
}
