public class CreditPaymentService {
    public int calculate(double summa, double procent, double srok) {
        double a = 1 + procent;
        double b = Math.pow(a, srok);
        double c = (b - 1);
        double d = procent / c;
        double e = procent + d;
        double result = summa * e;
        return (int) result;
    }
}
