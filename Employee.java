package comparator;

import java.util.Comparator;

class Employee implements Comparable<Employee>{  
int salary;  
String name;  
int age;  



public Employee() {
	
}

public Employee(int salary, String name, int age) {
	super();
	this.salary = salary;
	this.name = name;
	this.age = age;
}

public int compareTo(Employee st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1; 

}


}

	






