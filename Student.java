/*2.Create a class  Student with four data members and constructors-
   
Institute name---it should be static and final.
  rollno.
  name
  age

Generate getter /setter and Override toString();
In the main class make 3 objects of Student  ...set their values and and print details.*/


package inheritance;

public class Student {
   

	static final private String INSTITUTE_NAME="Anudip";
// data members 
   private int rollno;
   private String name;
   private int age;
   // default constructor
   public Student() {
		super();

	}
// Parameterized constructor
   public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
   public String getINSTITUTE_NAME() {
		return INSTITUTE_NAME ;
	}
   // setter and getter methods

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


// to string method
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}
   
}
