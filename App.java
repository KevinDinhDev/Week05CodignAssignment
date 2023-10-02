package week05;

public class App {

	public static void main(String[] args) {

		Logger loggerAsteriskTest = new AsteriskLogger();
		Logger loggerSpacedTest = new SpacedLogger();
		
		
		loggerAsteriskTest.log("Hello");
		System.out.println("----------------------"); //space
		
		loggerAsteriskTest.error("Hello");
		System.out.println("----------------------"); //space
		
		loggerSpacedTest.log("Hello");
		System.out.println("----------------------"); //space
		
		loggerSpacedTest.error("Hello");
	
	}

}
