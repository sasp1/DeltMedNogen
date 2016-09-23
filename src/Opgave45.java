
public class Opgave45 {
	public static void main(String[] args) {
		
		System.out.println(converter(1000));
		System.out.println(converter(System.currentTimeMillis()));
		
	}
	public static String converter(double inputInMS) {
		double years = 0, days = 0, hours = 0, minutes = 0, seconds = 0;
		double timeInMs = inputInMS; 
		years = (((((timeInMs/1000)/60)/60)/24)/365);
		days = (years%1)*365; 
		hours = (days%1)*24; 
		minutes = (hours%1)*60; 
		seconds = (minutes%1)*60;
		
		String timeNicelyFormatted = String.format("%.0f milliseconds is exactly: \n"
				+ "Years:\t\t %d\n"
				+ "Days:\t\t %d\n"
				+ "Hours:\t\t %d\n"
				+ "Minutes:\t %d\n"
				+ "Seconds:\t %d\n"
				, timeInMs, (int)years, (int)days, (int)hours, (int)minutes, (int)seconds); 
		return timeNicelyFormatted; 
//		return "The number of miliseconds: "+ timeInMs + " is exactly: \n"+
//				((int)years+" years,\n" + 
//				(int)days + " days,\n"+
//				(int)hours+" hours,\n"+
//				(int)minutes+ " minutes,\n" + 
//				"and "+(int)seconds + " seconds"); 
	}
	
}
