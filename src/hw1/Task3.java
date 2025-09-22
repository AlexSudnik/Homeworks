package hw1;

import java.util.Scanner;

public class Task3 {
    public void exitTask() {
        System.out.println("Введите слово, для выхода из программы введите exit");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                System.out.println("ok");
                break;
            }
                System.out.println(userInput + " Введите следующее слово");



        }
    }
}