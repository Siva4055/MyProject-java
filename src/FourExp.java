import java.util.Scanner;
public class FourExp {
	 static float anyCountryToIndianRupees(String country,int amt) {
		if(country.equalsIgnoreCase("USA")) {
			return amt*57.43f;
		}
		else if (country.equalsIgnoreCase("UK")){
			return amt*13.24f;
		}
		else return 0.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int usDollars,ukPounds;
		System.out.println("Enter country name");
		//System.out.println("Enter Dollars");
		Scanner sc = new Scanner(System.in);
		String country= sc.next();
		if(country.equalsIgnoreCase("UK || USA")) {
			sc.next();
		}
		else {
			System.out.println("Enter valid country ,not found");
		}
		//if(country.equalsIgnoreCase("UK ||USA")) {
		//	System.out.println( "Pounds || Dollars");
		}
	    /*System.out.println("Enter amount");
	    int amt=sc.nextInt();
	/*	float rupees=anyCountryToIndianRupees("USA",usDollars);
		System.out.println("indian rupees----USA   " +rupees);
		rupees=anyCountryToIndianRupees("UK",ukPounds);
		System.out.println("indian rupees----UK   " +rupees);
		System.out.println();*/
	    /*System.out.println("For this "+country+" for this amt="+amt+" indian rupees "+ anyCountryToIndianRupees(country,amt));*/
		


		
		



}
