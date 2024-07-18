package af;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JDM rx7 = new JDM("Mazda RX7",280f, 45f);
        JDM supra = new JDM("Toyota Supra",280f, 45f, false);
        Transport cybertruck = new Transport("Cybertruck",25000);

        System.out.println("\tДанные о доступных машинах загружены.");
        System.out.print("\tВведите, характеристики какой машины вы желаете видеть (rx7, supra, cybertruck): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        choice(input, rx7, supra, cybertruck);
    }
    public static void choice(String input, JDM rx7, JDM supra, Transport cybertruck) {
        switch (input) {
            case "rx7" :
                System.out.println(rx7.getValues());
                rx7.getCool();
                break;
            case "supra" :
                System.out.println(supra.getValues());
                supra.getCool();
                break;
            case "cybertruck" :
                System.out.println(cybertruck.getValues());
                break;
            default:
                System.out.println("\tМашина не найдена");
        }
    }
}