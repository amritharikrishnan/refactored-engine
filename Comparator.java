package collections;
import java.util.*;
import java.lang.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(10,"Amrit"));
		al.add(new Student(9,"Amrit"));
		al.add(new Student(11,"Amrit"));
		al.add(new Student(7,"Amrit"));
		
		Collections.sort(al,Student.sturollnocomparator);
		for(Student st:al){
		System.out.println(st);
		}
	}

}
