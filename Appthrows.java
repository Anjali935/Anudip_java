package exceptionHandling;

import java.io.IOException;

class Apple {

	public Integer dispApple() throws IOException
	{   throw new IOException();
	    
	}
}

class Banana {
	public Integer dispBanana() throws IOException {
		System.out.println("Starting of B");
		System.out.println("Ending of B");
		return new Apple().dispApple();
	}
}

class Cherry {
	public Integer dispC() throws IOException {
		System.out.println("Starting of C");
		System.out.println("Ending of C");
		return new Banana().dispBanana();
	}
}

public class Appthrows {
  public static void main(String[] args) {
	 System.out.println("Starting of main");
	 Integer result =null;
	  try
	{
		result =new Cherry().dispC();
	}
	catch(NullPointerException | ArithmeticException | IOException e)
	{
		System.out.println(e.getMessage());
	}catch(Exception e)
	  {
		System.out.println(e.getMessage());
	  }
	  
	  System.out.println(result);
	  System.out.println("Ending of main");
	  
}

}
