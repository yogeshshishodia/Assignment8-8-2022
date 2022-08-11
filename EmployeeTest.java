package comparator;

import java.util.*;

  
public class EmployeeTest{  
public static void main(String args[]){  
ArrayList<Employee> al=new ArrayList<Employee>();  
al.add(new Employee(10144,"Mohan",56));  
al.add(new Employee(47406,"Ajay",27));  
al.add(new Employee(95755,"Jai",21)); 

System.out.println("sorting by age");
  
Collections.sort(al);  
for(Employee st:al){  
System.out.println(st.salary+" "+st.name+" "+st.age);  
}  

System.out.println("  ");

System.out.println("sorting by salary");

Collections.sort(al,new RollNoComparator());  
for(Employee dm:al){  
System.out.println(dm.salary+" "+dm.name+" "+dm.age);  
}  



System.out.println("   ");

System.out.println("Sorting by name");

Collections.sort(al,new NameComparator());  
for(Employee st:al){  
System.out.println(st.salary+" "+st.name+" "+st.age);  
}  
}  
} 
