public class Ex1_10 {
	public static void main(String [] args) {
		double km = 14.0;
		double miles = km / 1.6;
		
		//double kmph = (14.0 / 45.5)*60;
		double mph = (miles / 45.5)*60;
		System.out.println(mph);
		
		double kilometers = 14.0;
        double miles2 = kilometers / 1.6;

        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles2 / rate;

        System.out.println(milesPerHour + " " + rate);
	}
}