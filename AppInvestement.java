/*2. Investment Calculator:
Create a Java program that calculates the future value of an investment. The user 
should input the initial investment, interest rate, and time period, and the program
should display the future value. */

import java.text.DecimalFormat;
import java.util.Scanner;
 class Investment 
{
	private Double initialInvestment;
	private Double interestRate;
	private Integer timePeriod;

	public Investment() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getInitialInvestment() {
		return initialInvestment;
	}

	public void setInitialInvestment(Double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(Integer timePeriod) {
		this.timePeriod = timePeriod;
	}

	@Override
	public String toString() {
		return "Investment [initialInvestment=" + initialInvestment + ", interestRate=" + interestRate + ", timePeriod="
				+ timePeriod + "]";
	}
  
}

 class InvestmentCalculatorImpl
{  // calculate future value
   public static Double calculateFutureValue(Investment  investment)
   {   /* formula used: 
          interest= interest rate/100
          future value= initial amount *(1+interest)^time period   */
	   Double interest=(investment.getInterestRate()/100.0);
	   Double futureValue=  investment.getInitialInvestment()* Math.pow((1+interest), investment.getTimePeriod());
	   return futureValue;
   }
}

public class AppInvestement {
    public static void main(String[] args) {
		//create object of Investment
		Investment investment = new Investment();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,Enter your initial Investment:");
		Double initialInvestment =sc.nextDouble();
		// User Input
		investment.setInitialInvestment(initialInvestment);;
		System.out.println("Please,Enter your interest Rate:");
		Double interestRate =sc.nextDouble();
		investment.setInterestRate(interestRate);
		System.out.println("Please,Enter your time period:");
		Integer timePeriod =sc.nextInt();
		investment.setTimePeriod(timePeriod);
		//format the value up to 2 decimal place
		Double displayFutureValue=InvestmentCalculatorImpl.calculateFutureValue(investment);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedFutureValue = decimalFormat.format(displayFutureValue);
        //display the formatted future value.
        System.out.println("The Future Value of an investment is:"+formattedFutureValue);
	}

}
