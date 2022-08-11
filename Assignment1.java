package javaarraylist;
import java.util.Vector;  
public class Assignment1 {  
       public static void main(String args[]) {  
          
          Vector<String> vec = new Vector<String>(4);  
    
          vec.add("Apple");  
          vec.add("Banana");  
          vec.add("Mango");  
          vec.add("Guava");  
          
         
          
         
            if(vec.contains("Apple"))  
            {  
               System.out.println("it is present at" + vec.indexOf("Apple"));  
               
            }  
            else  
            {  
               System.out.println("Sorry name not found");  
            }  
             
       }  
}  