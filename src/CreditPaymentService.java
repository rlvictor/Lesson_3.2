public class CreditPaymentService {
    public int calculate(int months, int sumCredit) {

        double interestRate = 9.99 / 12 / 100;
        double annuity = ((interestRate * (Math.pow((1 + interestRate), months))) / ((Math.pow((1 + interestRate), months)) - 1));
        double result = sumCredit * annuity;

        return (int) result;

    }
}
