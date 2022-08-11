package comparator;									


import java.util.Enumeration;


import java.util.Vector;

public class GFG {

	public static void main(String a[])
	{
		
		Vector<String> v = new Vector<String>();

		
		v.add("physics");
		v.add("chemistry");
		v.add("math");
		

		
		Enumeration<String> en = v.elements();

		while (en.hasMoreElements()) {
			
			

			
			System.out.println(en.nextElement());
		}
	}
}
