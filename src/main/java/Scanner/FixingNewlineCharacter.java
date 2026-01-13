package Scanner;

import java.util.*;

public class FixingNewlineCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        scan.nextLine();

        String str1 = scan.nextLine();

        double b = scan.nextDouble();
        scan.nextLine();

        String str2 = scan.nextLine();

        System.out.println("Название напитка: " + str1);
        System.out.println("Кол-во напитков: " + a + " шт");
        System.out.println("Емкость тары: " + b + " л");
        System.out.println("Магазин: \"" + str2 + "\"");


    }
}