package vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 List<Suv> suvList= new ArrayList();
		 List<Sedan> sedanList= new ArrayList();
		 
		 suvList.add(new Suv("Tata","Nexon",1200000,5));
		 sedanList.add(new Sedan("Honda","Amaze",900000,3));
		 
		 
		 for(Suv suv:suvList)
		 {
			System.out.println("Name="+suv.getName());
			System.out.println("Model="+suv.getModel());
			System.out.println("Price="+suv.getPrice());
			System.out.println("No Of Airbags="+suv.getNoairbags());
		 }
		

		 
		 for(Sedan sedan:sedanList)
		 {
			 
			 System.out.println("Name="+sedan.getName());
			 System.out.println("Model="+sedan.getModel());
			 System.out.println("Price="+sedan.getPrice());
			 System.out.println("No of Airbags="+sedan.getNoairbags());
			 
		 }
	}

}
