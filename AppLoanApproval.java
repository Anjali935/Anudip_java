/*1. Loan Approval:
You are developing a loan approval system. Write a Java program that takes a 
user's credit score, income, and loan amount as input and determines whether the 
loan should be approved or denied based on predefined criteria.

 */

import java.util.Scanner;
 class Application {
	private Integer creditScore;
	private Integer income;
	private Integer loanAmount;

	public Application() {
		super();
		
	}

	public Integer getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public Integer getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public String toString() {
		return "Application [creditScore=" + creditScore + ", income=" + income + ", loanAmount=" + loanAmount + "]";
	}
	

}
 class LoanApprovalImp 
{    // Method for checking eligibility for the loan.
	public static String checkLoanEligibility(Application application)
   {      // Using the credit score,Income and Loan Amount for criteria to decide
	   if(application.getCreditScore()>=700&& application.getIncome()>=35000 && application.getLoanAmount()<=500000)
	   {
		   return "Congratulation! You are eligible for loan"; 
				   
	   }
	   else if(application.getCreditScore()>=600&& application.getIncome()>=25000&&application.getLoanAmount()<=400000) 
	   {
		   return "Your loan is Approved.";
	   }
	   else
	   {
		   return "Sorry,Your loan is denied";
	   }
   }
}

public class AppLoanApproval 
{
	public static void main(String[] args)
	{   // create object of application class
		Application application=new Application();
		// User input
        Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Application");
		System.out.println("Please Enter your credit score:");
		Integer creditScore = sc.nextInt();
		application.setCreditScore(creditScore);
		System.out.println("Please Enter your Income:");
		Integer Income=sc.nextInt();
		application.setIncome(Income);
		System.out.println("Please Enter your Loan Amount:");
		Integer loanAmount=sc.nextInt();
	    application.setLoanAmount(loanAmount);
	    // Display message by calling method of LoanApprovalImp class
		String displayMessage=LoanApprovalImp.checkLoanEligibility(application);
		System.out.println(displayMessage);
	}
}
    

