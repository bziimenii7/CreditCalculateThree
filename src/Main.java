public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; //сумма кредита
        int loanPeriod = 36; //срок кредита в месяцах
        double annualInterestRate = 9.99; //годовая процентная ставка

        double monthlyPayment = service.calculate(loanAmount, loanPeriod, annualInterestRate);
        System.out.println("Сумма кредита - " + loanAmount + " рублей" + "\n" + "Срок кредита - " + loanPeriod
                + " месяцев" + "\n" + "Годовая ставка - " + annualInterestRate + "%" + "\n" + "Ежемесячный платеж - "
                + Math.round(monthlyPayment) + " рублей");
    }

}
