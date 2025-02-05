package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter v1.0");

        double mils = 10;
        double kilometers = milesToKilometers(mils);
        System.out.println("Result is " + mils + " миль це " + kilometers + " кілометрів");

    }

    public static double milesToKilometers(double mils) {
        return mils  * 1.60934;
    }

}
