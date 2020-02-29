package collections;

import java.util.*;

public class Student {
	int rollno;
	String name;
	
	public  Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
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
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	public static Comparator<Student> sturollnocomparator=new Comparator<Student>(){
		public int compare(Student s1,Student s2){
			int r1=s1.getRollno();
			int r2=s2.getRollno();
			return r1-r2;
			
		}
	};
	
	
	
	/*public int compareTo(Object comparestu){
		int comparerollno=((Student) comparestu).getRollno();
		return comparerollno-this.rollno;
	}
*/
}
