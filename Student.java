package comparator;

class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  



public Student() {
	
}





public Student(int rollno, String name, int age) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}



//sorting in ascending order

//public int compareTo(Student st){  
//if(age==st.age)  
//return 0;  
//else if(age>st.age)  
//return 1;  
//else  
//return -1; 

//sorting in descending order
public int compareTo(Student st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return -1;  
else  
return 1; 

}  
}  