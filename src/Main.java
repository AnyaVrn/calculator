public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summa = 1_000_000;
        double rate = 0.0999;
        double percent = rate / 12;
        double srok = 36;
        double х = service.calculate(summa, percent, srok);
        System.out.println(х);
    }
}