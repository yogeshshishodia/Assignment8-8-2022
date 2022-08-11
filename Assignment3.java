package javaarraylist;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;  
public class Assignment3


{  
	
       public static void main(String args[]) {  
    	   Scanner sc=new Scanner(System.in);
           String a=sc.nextLine();
           String b=sc.nextLine();
           String c=sc.nextLine();
           String d=sc.nextLine();
    	     
         
          
          List<String> li = new ArrayList<String>();  
    
          li.add(a);  
          li.add(b);  
          li.add(c);  
          li.add(d);  
     

          Set<String>s=new LinkedHashSet<String>(li);
          System.out.println(s);
         
          
             
       }  
}  
