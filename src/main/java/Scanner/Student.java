package Scanner;
import java.util.Scanner;

public class Student {
    // создаем инкапсулированные поля класса
    private int id;
    private String fullName;
    private int age;
    private String faculty;
    private double averageGrade;
    private String phoneNumber;


    // создаем перегруженные конструкторы-сеттеры
    public Student(int id, String name, int age, String faculty, double avgGrade, String phone) {
        this.id = id;
        fullName = name;
        this.age = age;
        this.faculty = faculty;
        averageGrade = avgGrade;
        phoneNumber = phone;
    }

    public Student(int id, String name, int age, String faculty) {
        this.id = id;
        fullName = name;
        this.age = age;
        this.faculty = faculty;
        averageGrade = 0.0;
        phoneNumber = "неизвестен";
    }

    // создаем методы-геттеры
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // создаем метод печати информации
    public void printInfo() {
        System.out.println("Информация о студенте #" + id);
        System.out.println("ID: " + id);
        System.out.println("ФИО: " + fullName);
        System.out.println("Возраст (лет): " + age);
        System.out.println("Факультет: " + faculty);
        System.out.println("Средний балл (GPA): " + averageGrade);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("=====");

    }

}


class Test {
    public static void main(String[] args) {

        // создаем объект класса Scanner
        Scanner scan = new Scanner(System.in);

        // сохраняем в переменные введенные пользователем значения
        int id1 = scan.nextInt();
        scan.skip("\\R");
        String name1 = scan.nextLine();
        int age1 = scan.nextInt();
        scan.skip("\\R");
        String faculty1 = scan.nextLine();
        double avgGrade1 = scan.nextDouble();
        scan.skip("\\R");
        String phone1 = scan.nextLine();
        int id2 = scan.nextInt();
        scan.skip("\\R");
        String name2 = scan.nextLine();
        int age2 = scan.nextInt();
        scan.skip("\\R");
        String faculty2 = scan.nextLine();

        // создаем 2 объекта класса
        Student student1 = new Student(id1, name1, age1, faculty1, avgGrade1, phone1);
        Student student2 = new Student(id2, name2, age2, faculty2);

        // вызываем метод печати информации
        student1.printInfo();
        student2.printInfo();

    }
}