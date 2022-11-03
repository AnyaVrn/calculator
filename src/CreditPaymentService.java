public class CreditPaymentService {
    public int calculate(double sum, double procent, double time) {
        double a = 1 + procent;
        double b = Math.pow(a, time);
        double c = (b - 1);
        double d = procent / c;
        double e = procent + d;
        double result = sum * e;
        return (int) result;
    }
}
