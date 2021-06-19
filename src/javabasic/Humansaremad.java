package javabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Humansaremad extends Humans{

	
	

	
	public static void main(String[] args) {
		Humans hum = new Humans();
		Scanner sc= new Scanner(System.in);
		
		 List<Humans> humanList = new ArrayList<>(); 
         humanList.add(new Humans("Alan",99,"Yes","Religion","India","Indian","behaviour","male"));
         humanList.add(new Humans("Aaln",19,"Yes","Religion","India","Indian","behaviour","male"));
         humanList.add(new Humans("Lana",9,"No","Religion","India","Indian","behaviour","male"));
         humanList.add(new Humans("Lana",9,"No","Religion","India","Indian","behaviour","male"));
         String var=sc.nextLine();
        
         for(Humans h:humanList)
         {
        	// System.out.println(var); 
        	String s=h.getName();
        	//System.out.println(h.getName());
//        	System.out.println();
         if(var.equals(h.getName()))
         {
        	//System.out.println("dja");
        	 System.out.println("Name="+h.getName());
        	 System.out.println("Behavoiur="+h.getBehaviour());
        	 System.out.println("Country="+h.getCountry());
            System.out.println("Gender="+h.getGender());
            System.out.println("Nationality="+h.getNationality());
            System.out.println("Religion="+h.getReligion());
           System.out.println("Believer="+h.getBeliever());
           

        	 
         }
      
//		System.out.println(humanList);
         }}
	}

     
	 

