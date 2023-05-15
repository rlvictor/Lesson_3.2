
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int oneYear = service.calculate(12, 1000000);
        System.out.println(oneYear);
        int twoYear = service.calculate(24, 1000000);
        System.out.println(twoYear);
        int threeYear = service.calculate(36, 1000000);
        System.out.println(threeYear);

    }
}
