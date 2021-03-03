package secao14;

import java.math.BigDecimal;

public abstract class Person {
	
	protected String name;
	
	protected BigDecimal annualIncome;
	
	public Person(String name, BigDecimal annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public abstract BigDecimal calculateTax();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getAnnualIncome() {
		return annualIncome;
	}
	
	public void setAnnualIncome(BigDecimal annualIncome) {
		this.annualIncome = annualIncome;
	}
}
