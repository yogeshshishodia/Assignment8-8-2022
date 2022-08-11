package javaarraylist;
import java.util.Scanner;
import java.util.Vector;  
public class Assignment2

{  
       public static void main(String args[]) {  
    	     
           Scanner sc=new Scanner(System.in);
           String a=sc.nextLine();
           
           
          
          Vector<String> vec = new Vector<String>(4);  
    
          vec.add("Apple");  
          vec.add("Banana");  
          vec.add("Mango");  
          vec.add("Guava");  
     

          
         
            if(vec.contains(a))  
            	
            {  
            	
               System.out.println("it is present at" +" "+ vec.indexOf(a));  
               
            }  
            else  
            {  
               System.out.println("Sorry name not found");  
            }  
             
       }  
}  
