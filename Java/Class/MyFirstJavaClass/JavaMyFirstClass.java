import java.util.*;
public class JavaMyFirstClass{
	public static void main(String[] args){
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("A",78.0,true);
		staff[1] = new Employee("B",98.0,false);
		staff[2] = new Employee("C",89.0,true);
		for(Employee temp:staff)
			System.out.println("Name : "+temp.getName()+" Gender : "+temp.getGender()+" Salary : "+temp.getSalary());
	}
	
}