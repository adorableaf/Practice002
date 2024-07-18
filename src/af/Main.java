package af;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JDM rx7 = new JDM("Mazda RX7",280, 45,1990, 2000);
        JDM supra = new JDM("Totoyota Supra",279,44,1618,25000, "кринж");
        JDM[] cars = new JDM[] {rx7, supra};

        System.out.println("a");
        System.out.print("Введите, характеристики какой машины вы желаете видеть (rx7, supra): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        choice(input, cars);
    }
    public static void choice(String input, JDM[] cars) {
        switch (input) {
            case "rx7" :
                System.out.println(cars[0].getValues());
                break;
            case "supra" :
                System.out.println(cars[1].getValues());
                break;
            default:
                System.out.println("Машина не найдена");
        }
    }
}