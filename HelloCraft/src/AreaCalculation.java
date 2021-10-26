

public class AreaCalculation {

	public static void main(String[] args) {
		System.out.println("areaof a circle" + "=" + area(4) + " "+"areaofrectangel "+"="+ area(10,5) );
		

	}
	public static double area(double radius) {
		if (radius<0) {
			return -1;
			}
		double areaofcircle=radius*radius*Math.PI;
		return areaofcircle;
	}
		public static double area(double x,double y) {
			if((x<0)||(y<0)) {
				return -1;
			}
			double areaofrectangel=x*y;
			return areaofrectangel;
		}

}
