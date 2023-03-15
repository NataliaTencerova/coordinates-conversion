package Coordinates_conversion;

public class Coordinates_conversion {
	private int degrees;
	private int minutes;
	private double seconds;
	
	public Coordinates_conversion(int degrees, int minutes, double seconds) {
		this.degrees = degrees;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Coordinates_conversion(double degreesDecimal) {
		degrees = (int) degreesDecimal;
		degreesDecimal -= degrees;
		degreesDecimal *= 60;
		minutes = (int) degreesDecimal;
		degreesDecimal -= minutes;
		seconds = degreesDecimal * 60;
	}
	
	public double inDegrees() {
		return degrees + minutes/60 + seconds/3600.0;
	}
	
	public String toString() {
		return ""+degrees+" st. "+minutes+"' "+seconds+"\"";
	}
	public static void main(String[] args) {
		if(args.length == 1) {
			Coordinates_conversion ps = new Coordinates_conversion(Double.parseDouble(args[0]));
			System.out.println(ps);
		}
		else if(args.length == 3) {
			int degrees = Integer.parseInt(args[0]);
			int minutes = Integer.parseInt(args[1]);
			double seconds= Double.parseDouble(args[2]);
			
			Coordinates_conversion ps = new Coordinates_conversion(degrees, minutes, seconds);
			System.out.println(ps.inDegrees()+ " st.");
		}
		else {
			System.out.println("Unexpected amount of parameters inserted.");
		}
	}

}