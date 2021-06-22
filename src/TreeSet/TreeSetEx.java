package TreeSet;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		
		 TreeSet<TreeSetExModel> ts = new TreeSet<>();
		 ts.add(new TreeSetExModel("Arun",1,799123246));
		 ts.add(new TreeSetExModel("Alan",40,856812324));
		 ts.add(new TreeSetExModel("Surya",6,12324623));
		 ts.add(new TreeSetExModel("Vijay",12,435123246));
//		 ts.add(new TreeSetExModel("Ar",12,1232546));
//		 ts.add(new TreeSetExModel("Arun",14,13246));
 //System.out.println(ts);
		 
		 Iterator<TreeSetExModel> itr=ts.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		   
		   Set <TreeSetExModel> set = new HashSet<TreeSetExModel>(ts);
		  // System.out.println(set);
		   Iterator<TreeSetExModel> itr2=set.iterator(); 
		   while(itr2.hasNext()){  
			   System.out.println(itr2.next());  
			  }
		   
		   Map<Integer,TreeSetExModel> map = new HashMap<Integer,TreeSetExModel>();
		   int i=1;
		   for(TreeSetExModel x:set)
		   {
			   map.put(i,x);
			   i++;
		   }
	   System.out.println(map);
		 
		   
//		   TreeSet<Integer> evenNumbers = new TreeSet<>();
//
//	        // Using the add() method
//	        evenNumbers.add(2);
//	        evenNumbers.add(4);
//	        evenNumbers.add(6);
//	        System.out.println("TreeSet: " + evenNumbers);
//
//	        TreeSet<Integer> numbers = new TreeSet<>();
//	        numbers.add(1);
//
//	        // Using the addAll() method
//	        numbers.addAll(evenNumbers);
//	        System.out.println("New TreeSet: " + numbers);
//		   
		 
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

	

	}
