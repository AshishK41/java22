package java_concepts;

public class cl2 extends cl1 {
	
	public cl2() {
		super(100);
		System.out.println("0 args Sample4 constructor");
	}

	public cl2(int a) {
		this("Cucumber");
		System.out.println("1 int args Sample4 constructor");
	}

	public cl2(String a) {
		super(10, "selenium");
		System.out.println("1 String args Sample4 constructor");
	}

	public cl2(int a, String b) {
		this(100);

		System.out.println("1 int and 1 String args Sample4 constructor");

	}

	public static void main(String[] args) {
		
		cl2 obj = new cl2(30, "Selenium");
		
		

	}

}
