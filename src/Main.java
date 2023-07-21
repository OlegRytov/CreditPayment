public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        //  int loanAmount = 1_000_000;
        //  double interestRate = 9.99;
        int monthlyPayment1 = (int) service.calculate(12, 1_000_000, 9.99);
        int monthlyPayment2 = (int) service.calculate(24, 1_000_000, 9.99);
        int monthlyPayment3 = (int) service.calculate(36, 1_000_000, 9.99);
        System.out.println("Кредит на один год: " + monthlyPayment1 + " рублей в месяц");
        System.out.println("Кредит на два года: " + monthlyPayment2 + " рублей в месяц");
        System.out.println("Кредит на три года: " + monthlyPayment3 + " рублей в месяц");

    }
}
