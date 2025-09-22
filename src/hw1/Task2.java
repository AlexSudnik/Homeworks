package hw1;

import java.util.Scanner;

public class Task2 {

    public void monthSelect () {
        System.out.println("Введите месяц");
        Scanner scanner = new Scanner(System.in);
        String let = scanner.next().toLowerCase();//.charAt(0);

        switch (let){
            case "январь":
                System.out.println("Зима");
                break;
            case "февраль":
                System.out.println("Зима");
                break;
            case "декабрь":
                System.out.println("Зима");
                break;
            case "март":
                System.out.println("Весна");
                break;
            case "апрель":
                System.out.println("Весна");
                break;
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
                System.out.println("Лето");
                break;
            case "июль":
                System.out.println("Лето");
                break;
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
                System.out.println("Осень");
                break;
            case "октябрь":
                System.out.println("Осень");
                break;
            case "ноябрь":
                System.out.println("Осень");
                break;
                default:
                System.out.println("Ошибка ввода");
        }

    }
}
