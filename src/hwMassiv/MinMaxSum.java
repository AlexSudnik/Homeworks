package hwMassiv;

public class MinMaxSum {

    public void minMaxSum() {

        int[] arr = {1, 5, 7, 9, 7, 5, 3, 1, 45, 87, 45, 89, 45, 23, 56};

        int min = arr[0];
        int max = arr[14];
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] < min) {
                min = arr[n];
            }
            if (arr[n] > max) {
                max = arr[n];
            }

        }
        int sum = min + max;
        System.out.println("Сумма минимального и максимального элементов равна " + sum);
    }
}
