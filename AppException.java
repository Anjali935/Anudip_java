package exceptionHandling;


public class AppException {
	 public static void main(String[] args) {
		System.out.println("Starting of main");
		// One try has different catch.
		Integer result= 0;
		Integer num1=24;
		Integer num2 =0;
		try {
			result = num1/num2;
			System.out.println("In Try");
			
		}
		catch(NullPointerException e)// we can do catch(NullPointerException e | ArithmeticException)
		{
			System.out.println(e);  // The above concept is called Mutiple catch block java -7 feature
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)// it must be there always
		{
			System.out.println(e);
		}
		System.out.println(result);
	}
	}
