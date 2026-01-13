package Scanner;
import java.util.Scanner;

public class WrappersAndParsing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        Integer b = Integer.valueOf(scan.nextLine());
        Integer c = Integer.decode(scan.nextLine());

        int sum = a + b + c;
        int difference = a - b - c;
        int product = a * b * c;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);

    }
}