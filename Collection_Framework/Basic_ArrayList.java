package Collection_Framework;

import java.util.*;

public class Basic_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList<String>();//creating a string type arraylist
		
			list.add("monday");
			list.add("tuesday");
			list.add("thursday");
			list.add("friday");
		
		//PRINTING THE LIST SIMPLY
			System.out.println(list);
		
		
     	//adding elemnts at the index
			list.add(0,"sunday");
			list.add(3,"wednesday");
		

		//PRINTING THE LIST IERTRATIVELY
		for(String i :list)
		{
			System.out.println(i);
	   }
		
		list.add("Saturday");
		
		System.out.println(list);
		
		
		//integer type arraylist
		
		ArrayList <Integer> number_list=new ArrayList<>();
		
		number_list.add(99);
		number_list.add(12);
		number_list.add(55);
		number_list.add(3,7);
		number_list.add(19);
		number_list.add(29);
		
		
		System.out.println("list before sorting  :  "+ number_list);
		
		number_list.sort(null);
			
			System.out.println("sorted list  :  "+number_list);
		
		number_list.remove(3);
			
			System.out.println("after removing elemnt : "+ number_list);
		
	}

}
