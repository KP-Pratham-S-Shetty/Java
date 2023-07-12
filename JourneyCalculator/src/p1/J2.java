package p1;

public class J2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JourneyCalculator journeyCalculator = new JourneyCalculator();

		double distance=journeyCalculator.calculateDistance(60.0, 1.5);
		System.out.printf("%.2f",distance);*/
		
		JourneyCalculator j = new JourneyCalculator();
		
		/*double dist = j.calculateDistance(60.0,1.5);
		System.out.printf("%.2f",dist);*/
		
		System.out.printf("%.2f",j.calculateDistance(60.0,1.5)) ;

	/*public double calculateDistance(double speed, double time) {
		return speed * time;
	}*/

}
}