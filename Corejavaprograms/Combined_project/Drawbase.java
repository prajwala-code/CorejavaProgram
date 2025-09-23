package com.tnsif.lambdaexpressions;

interface Drawbase {
	   public void draw(); 
}
public class LambdaExpressionExample2 { 
	   public static void main(String[] args) { 
		   int width=10;
		     Drawbase d2=()->{ 
		    	  System.out.println("Drawing "+width); 
		     };
		     
		     d2.draw();
	   }
}



	
