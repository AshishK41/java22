package java_concepts;

public class cl4 {
	static cl4 obj;

	public void abc()
	{
		System.out.println("Abc method");
	}
	
	public static void main(String[] args) {
		
		obj =new cl4();
		
		try
		{
			System.out.println("try block is started");
			obj.abc();
			System.out.println("try block is Ended");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block 1");
		}
		catch (NullPointerException e) {
			System.out.println("catch block 2");
		}
		catch(RuntimeException e)
		{
			System.out.println("catch block 3");
		}
		catch(Exception e)
		{
			System.out.println("catch block 4");
		}
		catch(Throwable e)
		{
			System.out.println("catch block 5");
		}
		finally
		{
			System.out.println("Finally block of code");
		}

		
		
	}

}
