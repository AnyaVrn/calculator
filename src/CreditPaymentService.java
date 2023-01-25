public class CreditPaymentService {
    public int calculate(double sum, double procent, double time) {
        double percentage = 1 + procent;
        double degree = Math.pow(percentage, time);
        double denominator = (degree - 1);
        double numenator = procent / denominator;
        double variable = procent + numenator;
        double result = sum * variable;
        return (int) result;
    }
}
