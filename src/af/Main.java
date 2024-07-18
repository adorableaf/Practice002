package af;

public class Main {
    public static void main(String[] args) {
        JDM rx7 = new JDM();
        rx7.setValues("Mazda RX7",280, 45,1990, 2000);

        JDM supra = new JDM();
        supra.setValues("Totoyota Supra",279,44,1618,25000);

        rx7.getValues();
        supra.getValues();
    }
}