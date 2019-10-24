package oom.young.exam;

public class Main {
      public static void main(String[] args) {
    	  printStar(5);
      }
      

    public static void printStar(int line) {
    	  for(int z=0; z<line; z++ ) 
    	  {
    	     for(int i = 0; i < z+1; i++)
    	     {
    		     System.out.print("*");
    	     }
    	     System.out.println();
    	  }
      }
}
