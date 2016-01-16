class Employee{
	private String employeeName;
	private double employeeSalary;
	private boolean employeeGender;
	public Employee(String name,double salary,boolean gender){
		employeeGender = gender;
		employeeName = name;
		employeeSalary = salary;
	}
	public String getName(){
		return employeeName;
	}
	public boolean getGender(){
		return employeeGender;
	}
	public double getSalary(){
		return employeeSalary;
	}
}