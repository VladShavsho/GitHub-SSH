package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter v1.0");

        double mils = 10;
        double kilomt = 10;
        double kilometers = milesToKilometers(mils);
        double miles = kilometersToMiles(kilomt);
        System.out.println("Result is " + miles + " миль і " + kilometers + " кілометрів");

    }

    public static double milesToKilometers(double mils) {
        return mils  * 1.60934;
    }
    public static double kilometersToMiles(double kilomt) {
        return kilomt * 0.621371;
    }

}
