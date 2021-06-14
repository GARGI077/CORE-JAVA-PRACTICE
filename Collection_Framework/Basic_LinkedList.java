package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class Basic_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList <String> al=new LinkedList<String>();
		
		al.add("Ravivar");
		
		
		al.add("Somvar");
		al.add("Ravivar");
		
		al.add("Mangalvar");
		al.add("guruvar");
		
		Iterator <String> itr = al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		al.add(3 ,"Budhvar" );
		al.addFirst("Shanivar");
		al.addLast("Shukrvar");
		
		System.out.println(al);

		al.removeFirstOccurrence("Ravivar");
		
		Iterator i=al.descendingIterator(); //Reversing the list
		
	       while(i.hasNext())  
           {  
               System.out.println(i.next());  
           }  
	}

}
