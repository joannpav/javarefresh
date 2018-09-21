package javarefresh;

public class Cities {
	
	protected static String[] cities = new String[] {"Chicago", "Las Vegas"};
	protected static String cities_str = "Chicago, Las Vegas";
	
	public static void imperative_find_city() {				
		boolean found = false;
		for(String city: cities) {
			if (city.equals("Chicago")) {
				found = true;
				System.out.println("found");
				break;
			}
		}		
	}
	
	public static void declarative_find_city() {
		System.out.println("Found chicago?:" + cities_str.contains("Chicago"));
	}
	
	public static void main(String []args) {
		imperative_find_city();
		declarative_find_city();
	}
}
