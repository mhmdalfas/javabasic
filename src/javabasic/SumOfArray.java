package javabasic;

public class SumOfArray {

	
	    public static void main(String[] args) {
	     
	        int[] array = {5, 1, 3, 4, 2};
	        System.out.println(sumOfNumbersInArray(array));
	    }
	 
	    public static int sumOfNumbersInArray(int[] array) {
	       
	        int i=0,sum=0;
	        while(i<=array.length-1)
	        {
	            sum=sum+array[i];
	            i++;
	        }
	        
	        return sum;
	    }
	}
	
	

