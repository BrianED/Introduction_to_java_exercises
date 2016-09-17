public class Ex1_9 {

    public static void main(String[] strings) {

        final double width = 4.5;
        final double height = 7.9;

        double area = width * height;
		System.out.printf("%.2f\n",area);

        System.out.printf("%.2f * %.1f = %.2f", width, height, area);
    }
}