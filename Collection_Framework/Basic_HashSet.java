package Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class Basic_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating HashSet 
		HashSet <String> set =new HashSet();

		// Adding elements 
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
	    set.add("Vijay");  
        set.add("Arun");  
        set.add("Sumit");  
		Iterator <String> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		  set.remove("Ravi");  
		  
		  System.out.println(set);
		  
		  System.out.println(set.contains("six"));//checking the elements the set
		  System.out.println(set.contains("five"));
	
		  System.out.println(set.size());
		  
		  set.removeAll(set);  
          System.out.println("After invoking removeAll() method: "+set);  
          
          set.add("Ravi");  
          set.add("Vijay");  
          set.add("Arun");  
          set.add("Sumit");  
          
          System.out.println(set);
          HashSet<String> set1=new HashSet<String>();  
          set1.add("Ajay");  
          set1.add("Gaurav");  
          set.addAll(set1);  
          System.out.println("Updated List: "+set);  
       
          //Creating a new cloned set  
          	HashSet<String> clonedSet = new HashSet<String>();  
          //Clone the HashSet  
          	clonedSet = (HashSet)set.clone();  
          //Displaying the new Set after Cloning;  
          	System.out.println("The new clone set elements: " + clonedSet);
          	
          	clonedSet.clear();
          	System.out.println("The colne set cleared " +clonedSet);
	}

}
