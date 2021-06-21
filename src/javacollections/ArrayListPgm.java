package javacollections;

import java.util.ArrayList;

public class ArrayListPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Double> doubles = new ArrayList<>();
		double d = 4.2;
		doubles.add(d);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("List As A String");
		
		
		System.out.println(doubles.get(0));
		System.out.println(list.get(0));
	}

}
