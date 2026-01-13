package Scanner;

import java.util.Scanner;


public class UsingNextAfterInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //сразу выводим на печать принимаемое на вход значение
        System.out.println(sc.nextInt());
        //при использовании next() символ \n в буфере игнорируется
        System.out.println(sc.next());

    }
}