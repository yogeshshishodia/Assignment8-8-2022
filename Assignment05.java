package javaarraylist;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment05 {
	
	public static void main(String[]args) {
		
		HashMap<String,String> credential=new HashMap<String,String>();
		
		credential.put("yogesh","yogeshpass");
		credential.put("ravi","pass");
		credential.put("tinku","welcome");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String uname=sc.nextLine();
		System.out.println("enter the password");
		
		String pass=sc.nextLine();
		
		if(credential.containsKey(uname)) {
			System.out.println("username is correct");
			
			
		}
		if(credential.containsValue(pass)) {
			System.out.println("password is correct");
			
		}else {
			System.out.println("error");
		}
		
	}

}

