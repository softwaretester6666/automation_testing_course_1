package Scanner;
/*
В больших приложениях делают один глобальный Scanner,
чтобы его не закрывать и использовать из разных мест.
Доступны отдельные методы, но не объект.
*/

import java.util.Scanner;

public final class Console {
    private static final Scanner SC = new Scanner(System.in);

    // "прячем" конструктор чтобы никто не создал экземпляр
    private Console() {}

    public static String nextLine() {
        // предоставляем только метод nextLine (никакие другие недоступны)
        return SC.nextLine();
    }

    public static int nextInt() {
        // предоставляем только метод nextInt (никакие другие недоступны)
        int res = SC.nextInt();
        // "съедаем" остаточный символ \n в буфере
        SC.nextLine();
        return res;
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