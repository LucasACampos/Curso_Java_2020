package secao8;

public class Employee {
	
	private String name;
	
	private double grossSalary;
	
	private double tax;
	
	public Employee() {
	}
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}
	
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public void increaseSalary(double percentage){
		grossSalary += (percentage * 0.01) * grossSalary;
	}
}
