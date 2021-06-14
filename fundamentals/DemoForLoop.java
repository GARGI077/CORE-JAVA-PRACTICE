package completejava;

public class DemoForLoop {

public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=1;
     /*
      * syntax of while loop
      * 
      * initialization;
      * while(condition)
      * {
      * increment/decrement;
      * }
      * 
      */
     
     System.out.println("While loop Entry control loop");
     while(i<=10)
     {
    	 System.out.println(i);
    	 i++;
     }
     
     /*
      * initialisation;
      * do
      * {
      * 	statement
      * 
      * 	increment/decrement;
      * 
      * }while(condition);
      */
	
     System.out.println("DO WHILE LOOP exit controol loop");

     int x=10;
     do
     {
    	 System.out.println(x);
    	 x--;
     }while(x!=0);
     
     
     /*
      * for loop
      * 
      * for(initialisation;condition;increment/decrement)
 			{
 				statements;
 			
 			}
 
      *
      */
     
  
     for(int j=0;j<5;j++)
     {
    	 System.out.println("*");
     }
     
}

}
