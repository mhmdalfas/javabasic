package humans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Humansaremad extends Humans{

	

	


	public static void main(String[] args) {
	//	Humans hum = new Humans();
		Scanner sc= new Scanner(System.in);
		
		 List<Humans> humanList = new ArrayList<>(); 
         humanList.add(new Humans("Alan",99,"Yes","Christian","India","Indian","Good","male"));
         humanList.add(new Humans("Aaln",19,"Yes","Religion","India","Indian","behaviour","male"));
         humanList.add(new Humans("Lana",16,"No","Religion","India","Indian","behaviour","female"));
         humanList.add(new Humans("Lana",9,"No","Religion","India","Indian","behaviour","female"));
         String var=sc.nextLine();
         
         
         
         
        
         for(Humans h:humanList)
         {
        	// System.out.println(var);  
        //	String s=h.getName();
        	//System.out.println(h.getName());
//        	System.out.println();
        	 
        	
        	 
        	 
         if(h.getName().equals(var))
         {
        	//System.out.println("dja");
        	 System.out.println("Name="+h.getName());
        	 System.out.println("Age="+h.getAge());
        	 System.out.println("Believer="+h.getBeliever());
        	 System.out.println("Religion="+h.getReligion());
        	 System.out.println("Country="+h.getCountry());
//        	 System.out.println("Behaviour="+h.getBehaviour());
        	 System.out.println("Nationality="+h.getNationality());
        	 System.out.println("Behaviour="+h.getBehaviour());
        	
            System.out.println("Gender="+h.getGender());
         }
          
            
           
           

        	 
         }
      
//		System.out.println(humanList);
         }}
	

     
	 

