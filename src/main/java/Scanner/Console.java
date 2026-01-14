package Scanner;
// защита System.in от "дурака"

import java.util.Scanner;

public final class Console {
    private static final Scanner SC = new Scanner(System.in);

    // "прячем" конструктор чтобы никто не создал экземпляр
    private Console() {}

    // предоставляем только методы nextLine и nextInt (никакие другие недоступны)
    public static String nextLine() {
        return SC.nextLine();
    }

    public static int nextInt() {
        return Integer.parseInt(SC.nextLine());
    }
}

class Main {
    public static void main(String[] args) {
        // Console console = new Console();
        // не можем создать объект, т.к. конструктор скрыт

        System.out.println("Введите ID сотрудника:");
        int id = Console.nextInt();
        System.out.println("Введите имя:");
        String name = Console.nextLine();
        System.out.println("Имя (" + name + ") и ID ("
                + id + ") сотрудника успешно внесены в БД");

    }
}