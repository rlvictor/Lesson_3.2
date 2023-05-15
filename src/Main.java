
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double oneYear = service.calculate(12, 1000000);
        System.out.println((int) oneYear);
        double twoYear = service.calculate(24, 1000000);
        System.out.println((int) twoYear);
        double threeYear = service.calculate(36, 1000000);
        System.out.println((int) threeYear);

    }
}
