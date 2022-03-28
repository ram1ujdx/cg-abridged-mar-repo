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
	
	public static Employee searchByEmployeeId(Employee []employees, int employeeId){
		for(Employee emp:employees){
			if(emp.employeeId==employeeId){
				return emp;
			}
		}
		return null;
	}

	public static Employee searchByEmployeeName(Employee []employees, String employeeName){
		for(Employee emp:employees){
			if(emp.employeeName.equalsIgnoreCase(employeeName)){
				return emp;
			}
		}
		return null;
	}

	public static Employee[] getEmployees(Employee []employees, float salaryLimit){
		Employee []list = new Employee[employees.length];
		int index=0;
		for(Employee emp:employees){
			if(emp.salary >= salaryLimit){
				list[index]=emp;
				index++;
			}
		}
		return list;
	}
		
	public static void main(String []args){

		Employee []employeeList = new Employee[5];
		employeeList[0] = new Employee(1002,"Rahul","rahul@xyz.com",46000F);
		employeeList[1] = new Employee(1004,"Harshita","harshita@xyz.com",56000F);
		employeeList[2] = new Employee(1007,"Manjit","manjit@xyz.com",48000F);
		employeeList[3] = new Employee(1008,"Gaurav","gaurav@xyz.com",57000F);
		employeeList[4] = new Employee(1009,"Yash","yash@xyz.com",76000F);

		Employee e1 = searchByEmployeeId(employeeList, 1007);
		e1.print();
		Employee e2 = searchByEmployeeName(employeeList, "gaurav");
		e2.print();

		System.out.println("List of employees getting salary more than 50k are - ");

		Employee []list = getEmployees(employeeList, 50000);

		for(Employee emp : list){
			if(emp==null){
				break;
			}
			emp.print();
		}
		
		
		
	}
}