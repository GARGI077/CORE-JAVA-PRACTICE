package Collection_Framework;

import java.util.*;

public class Basic_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> li = new ArrayList<>();
				
				li.add(8);
				li.add(2);
				li.add(6);
				System.out.println(li);
				li.sort(null);
	
		//Creating a List of type Book using ArrayList  
	//	List<Book> list_book=new ArrayList<Book>();  
		  
		//Creating a List of type String using LinkedList  
		List<String> al=new LinkedList<String>();  
		
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
		
		System.out.println(al);

	 
		
	}

}
