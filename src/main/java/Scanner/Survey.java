package Scanner;

import java.util.Scanner;

class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Input your name:");
        String name = scan.nextLine();
        System.out.println("Input your weight:");
        double weight = scan.nextDouble();
        scan.nextLine();
        System.out.println("Input your favorite movie:");
        String movie = scan.nextLine();
        System.out.println("Do you like Java?");
        boolean userLikeJava = scan.nextBoolean();
        scan.nextLine();
        System.out.println("Input the reason:");
        String reason = scan.nextLine();

        System.out.println("Привет, " + name + "!");
        System.out.println("Вам " + age + " лет");
        System.out.println("Вы весите " + weight + " кг");
        System.out.println("Ваш любимый фильм: " + movie);
        System.out.println("Любите ли Вы язык Java? (true/false): " + userLikeJava);
        System.out.println("Почему? " + reason);

    }
}