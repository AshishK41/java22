package collections;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> li = new ArrayList <String>();
		li.add("Ashish");
		li.add("automation");
		li.add("is so strong");
		li.add("getup");
		li.add("let's go");
		
		for(String s:li) {
			System.out.println(s);
		}
	}

}
