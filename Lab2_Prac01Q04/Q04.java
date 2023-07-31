
package com.mycompany.q04;

public class Q04 
{

    public static void main(String[] args) 
    {
        /*//break-----------------------
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print("I’m  out of the Loop now"); */
        
        
        //continue----------------------
        int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print("I’m  out of the Loop now"); 

    }
}
