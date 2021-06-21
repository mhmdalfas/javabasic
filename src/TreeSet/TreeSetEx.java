package TreeSet;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		
		 TreeSet<TreeSetExModel> ts = new TreeSet<>();
		 ts.add(new TreeSetExModel("Arun",1,123246));
//		 ts.add(new TreeSetExModel("Ar",12,1232546));
//		 ts.add(new TreeSetExModel("Arun",14,13246));
//	 System.out.println(ts);
		 
		 Iterator<TreeSetExModel> itr=ts.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  

		 
//		 Iterator<TreeSetExModel> iterator = ts.iterator();
//	        System.out.print("Tree set data: ");
//	        
//	        
//	        iterator = ts.iterator();
//	        
//	        // Displaying the Tree set data
//	        while (iterator.hasNext())
//	            System.out.print(iterator.next() + " ");
//	  
//	        System.out.println();
//	        System.out.println("Now the size of tree set: " +
//	                           ts.size());
//		 
		 

	}

	

	}}
