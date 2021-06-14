package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();//list creating 
		
		list.add("Gargi");//adding elements to the list 
		list.add("Singh");

		Iterator<String> itr=list.iterator();  		//traversing through iterator 
		
		while(itr.hasNext()){  
		System.out.println(itr.next()); 

		}
		
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		int val;
		Iterator <Integer> it=li.iterator();
		
		
	}
}

