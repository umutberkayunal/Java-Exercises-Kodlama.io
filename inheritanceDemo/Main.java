package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
//		InstructorLoanManager instructorloanmanager = new InstructorLoanManager();
//		instructorloanmanager.calculateLoan();
		LoanUI loanUI = new LoanUI();
		loanUI.calculateLoan(new InstructorLoanManager());
		loanUI.calculateLoan(new FarmingLoanManager());
		loanUI.calculateLoan(new EducationLoanManager());
	}
}
