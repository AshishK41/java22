package java_concepts;

public class cl3 {

	public static void main(String[] args) {
		System.out.println("MMS");

		String a = null;

		try
		{
			System.out.println("Try Block is Started");
			int b = a.length();
			System.out.println(b);
			System.out.println("Try Block is Ended");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception 1");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception 2");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime Exception 3");
		}
		catch(Exception e)
		{
		
			System.out.println("Exception 4");
		}
		
		System.out.println("MME");

	}


}
