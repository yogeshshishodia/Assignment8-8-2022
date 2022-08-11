package javaarraylist;

import java.util.Random;

public class RandomNumberAss10 {
	
	
	


 
public static void main( String args[] )   
{  

	
	Random num=new Random();
	System.out.println("Random number between 0 to 200");
	
	for(int a=1;a<=5;a++) {
		System.out.println(num.nextInt(200));
	}
	
} 
}