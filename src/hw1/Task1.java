package hw1;

import java.util.Scanner;

public class Task1 {

    public void glasOrSoglasn () {
        System.out.println("Введите букву");
        Scanner scanner = new Scanner(System.in);
        char let = scanner.next().toLowerCase().charAt(0);

        if (let == 'e' || let == 'u' || let == 'o' || let == 'a') {
            System.out.println("Гласная");
            ;
        } else {
            System.out.println("Согласная");
        }


    }
}
