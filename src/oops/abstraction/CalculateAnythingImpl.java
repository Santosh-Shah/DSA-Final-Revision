package oops.abstraction;

public class CalculateAnythingImpl extends CalculateAnything{
    @Override
    double addition(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    double subtract(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    double multiply(double n1, double n2) {
        return n1 * n2;
    }
}
