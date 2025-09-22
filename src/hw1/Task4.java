package hw1;

import java.util.Scanner;

public class Task4 {

    public void devideOn3 () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int int1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int int2 = scanner.nextInt();
        int result=0;

        for (int i=int1; i<=int2; i++) {
            //int nextNumber=i+1;
        result = (int1 + int2)*(int2 - int1 + 1)/2;
    }
        System.out.println(result);

}
}
