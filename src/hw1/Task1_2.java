package hw1;

import java.util.Scanner;

public class Task1_2 {

    public void glasOrSoglasn1 () {
        System.out.println("Введите букву");
        Scanner scanner = new Scanner(System.in);
        char let = scanner.next().toLowerCase().charAt(0);

        switch (let){
            case 'e':
                System.out.println("Гласная");
                break;
            case 'o':
                System.out.println("Гласная");
                break;
            case 'a':
                System.out.println("Гласная");
                break;
            case 'u':
                System.out.println("Гласная");
                break;
            default:
                System.out.println("Соласная");
        }

        }


    }

