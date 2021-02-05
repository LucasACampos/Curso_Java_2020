package secao8.util;

public class CurrencyConverter {
	
	public static final double TAX_IOF = 0.06;
	
	public static double convertToReaisFromDollar(double dolarPrice, double amountOfDollarsWillBuy) {
		
		double amountWillBuy = (dolarPrice * amountOfDollarsWillBuy);
		double total = amountWillBuy + amountWillBuy * TAX_IOF;
		return  total;
		
	}
}
