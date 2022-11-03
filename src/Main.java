public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000;
        double rate = 0.0999;
        double percent = rate / 12;
        double loan = 36;
        double х = service.calculate(sum, percent, loan);
        System.out.println(х);
    }
}