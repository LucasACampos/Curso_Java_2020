package secao10;

import java.math.BigDecimal;

public class Employee {
	
	int id;
	
	String name;
	
	BigDecimal salary;
	
	public Employee(int id, String name, BigDecimal salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String display (){
		return id +", "+name+", "+String.format("%.2f", salary);
	}
	
	public void increaseSalary(double percentage){
		salary = salary.multiply(BigDecimal.valueOf(10 * 0.01)).add(salary);
	}
}
