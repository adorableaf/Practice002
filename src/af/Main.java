package af;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JDM rx7 = new JDM("Mazda RX7",280f, 45f);
        rx7.tires.setWornOut(false, 50);
        rx7.setBreaker(true);

        JDM supra = new JDM("Toyota Supra",280f, 45f, false);
        supra.tires.setWornOut(true, 1000);

        JDM rx10 = new JDM("Mazda RX10", 1000f, 91f) {
            @Override
            public void AutoDrift(float angle) {
                super.AutoDrift(angle);
                this.tires.isWornOut(false);
                System.out.println("Шины в идеальном состоянии");
            }
        };


        Truck cybertruck = new Truck("Cybertruck",25000);

        System.out.println("\n\tДанные о доступных машинах загружены.");
        System.out.print("\tВведите, характеристики какой машины вы желаете видеть (rx7, supra, cybertruck, rx10): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        choice(input, rx7, supra, cybertruck, rx10);
    }
    public static void choice(String input, JDM rx7, JDM supra, Transport cybertruck, JDM rx10) {
        switch (input) {
            case "rx7" :
                System.out.println(rx7.getValues());
                rx7.getCool();
                rx7.tires.info();
                rx7.infoBreaker();
                break;
            case "supra" :
                System.out.println(supra.getValues());
                supra.getCool();
                supra.tires.info();
                break;
            case "cybertruck" :
                System.out.println(cybertruck.getValues());
                break;
            case "rx10" :
                System.out.println(rx10.getValues());
                rx10.AutoDrift(rx10.angle);
                break;
            default:
                System.out.println("\tМашина не найдена");
        }
    }
}