public class Ex1_13 {
	
	public static void main(String[] args) {
		
		double a = 3.4, b = 50.2, e = 44.5;
		double c = 2.1, d = .55, f = 5.9;
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		System.out.println("x = " + x + "\ny = " + y);
	}
}