package java_concepts;

import java.io.FileInputStream;
import java.io.IOException;

public class cl5 {

	public static void main(String[] args) {

		int a=10;
		int b=0;
		String c=null;
		String d="selenium";
		
		try
		{
			System.out.println("Try block started");
			
			//System.out.println(a/b);
			//System.out.println(c.length());
			FileInputStream fis = new FileInputStream("");
			System.out.println(Integer.parseInt(d));
			System.out.println("Try block Ended");
		}
		catch (ArithmeticException e) {
			System.out.println("Catch Block 1 ");
		}
		catch (NumberFormatException e) {
			System.out.println("Catch Block 2 ");
		}
		catch (NullPointerException  e) {
			System.out.println("Catch Block 3 ");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Catch Block 4 ");
		}
		catch (RuntimeException  e) {
			System.out.println("Catch Block 5");
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
		catch (Exception e) {
			System.out.println("Catch Block 6 ");
		}
		
		catch (Throwable e) {
			System.out.println("Catch Block 7 ");
		}
		finally
		{
			System.out.println("finally block of code");
		}

	}

}
