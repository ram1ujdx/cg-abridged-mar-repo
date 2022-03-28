class Employee{
	 int employeeId;
	 String employeeName;
	 String email;
	 float salary;
	
	public Employee(int employeeId, String employeeName, String email, float salary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}

	public void print(){
		System.out.println("ID : "+employeeId+" | Name : "+employeeName+" | Salary : "+salary+"| Email : "+email);
	}
}

class ArraysOfObject{
	public static void main(String []args){

		Employee []employeeList = new Employee[5];
		employeeList[0] = new Employee(1002,"Rahul","rahul@xyz.com",46000F);
		employeeList[1] = new Employee(1004,"Harshita","harshita@xyz.com",56000F);
		employeeList[2] = new Employee(1007,"Manjit","manjit@xyz.com",48000F);
		employeeList[3] = new Employee(1008,"Gaurav","gaurav@xyz.com",57000F);
		employeeList[4] = new Employee(1009,"Yash","yash@xyz.com",76000F);

		for(Employee emp:employeeList){
			if(emp.salary>=50000){
				emp.print();	
			}	
		}
		
		
	}
}