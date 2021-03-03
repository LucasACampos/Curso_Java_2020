package secao14;

import java.math.BigDecimal;

public class JuridicPerson extends Person{
	
	private int employeNumber;
	
	public JuridicPerson(String name, BigDecimal annualIncome, int employeNumber) {
		super(name, annualIncome);
		this.employeNumber = employeNumber;
	}
	
	@Override
	public BigDecimal calculateTax() {
		double percentageOfTax = employeNumber > 10 ? 0.14 : 0.16;
		
		return annualIncome.multiply(BigDecimal.valueOf(percentageOfTax));
	}
	
	public int getEmployeNumber() {
		return employeNumber;
	}
	
	public void setEmployeNumber(int employeNumber) {
		this.employeNumber = employeNumber;
	}
}
