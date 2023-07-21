public class CreditPaymentService {
    public double calculate(int year, int loanAmount, double interestRate) {
        double monthlyInterestRate = interestRate / 12 / 100;
        double annuityRatio1 = monthlyInterestRate * Math.pow(monthlyInterestRate + 1, year) / (Math.pow(monthlyInterestRate + 1, year) - 1);
        return (annuityRatio1 * loanAmount);
    }
}
