public class Ex1_11 {
	public static void main(String[] args) {
		int secondsInAYear = 365 * 24 * 60 * 60;
		double births = secondsInAYear / 7.0;
		double deaths = secondsInAYear / 13.0;
		double immigrants = secondsInAYear / 45.0;
		int population = 312032486;
		double year1 = (births + immigrants + population) - deaths;
		double year2 = (births + immigrants + year1) - deaths;
		double year3 = (births + immigrants + year2) - deaths;
		double year4 = (births + immigrants + year3) - deaths;
		double year5 = (births + immigrants + year4) - deaths;
		System.out.println((int)year1);
		System.out.println((int)year2);
		System.out.println((int)year3);
		System.out.println((int)year4);
		System.out.println((int)year5);		
		
		double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;



        double currentPopulation = 312032486;

        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)currentPopulation);
		}
	}
}