package secao14;

import java.math.BigDecimal;

public class PhysicalPerson extends Person{
	
	private double spendingWithHealth;
	
	public PhysicalPerson(String name, BigDecimal annualIncome, double spendingWithHealth) {
		super(name, annualIncome);
		this.spendingWithHealth = spendingWithHealth;
	}
	
	@Override
	public BigDecimal calculateTax() {
		
		double percentageOfTax = annualIncome.longValueExact() > 20000 ? 0.25 : 0.15;
		
		return ( annualIncome.multiply(BigDecimal.valueOf(percentageOfTax)).subtract(BigDecimal.valueOf(spendingWithHealth * 0.5)) );
	}
	
	public double getSpendingWithHealth() {
		return spendingWithHealth;
	}
	
	public void setSpendingWithHealth(double spendingWithHealth) {
		this.spendingWithHealth = spendingWithHealth;
	}
}
