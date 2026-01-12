import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperature = scan.nextDouble();
        scan.nextLine();
        String symptoms = scan.nextLine();
        long phone_number = scan.nextLong();
        scan.nextLine();
        String fio = scan.nextLine();

        System.out.println(fio + ", спасибо за обращение!");
        System.out.println("Данные о Вашей температуре: " + temperature);
        System.out.println("и симптомах " + symptoms);
        System.out.println("переданы мед персоналу клиники!");
        System.out.println("Ждите звонка по номеру: " + phone_number);

    }

}