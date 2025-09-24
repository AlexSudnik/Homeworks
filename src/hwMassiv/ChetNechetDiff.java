package hwMassiv;

public class ChetNechetDiff {

    @Deprecated
    public void chetNechetDiff() {

        int[] arr = {3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};

        int sumChet = 0;
        int sumNechet = 0;

        for (int n = 0; n < arr.length; n++) {
            if (n % 2 == 0) {
                sumChet = sumChet + arr[n];
            }
            if (n % 2 != 0) {
                sumNechet = sumNechet + arr[n];
            }
        }

        int chetNechetDifference = sumChet - sumNechet;
        System.out.println("Разность четных и нечетных мест равна " + chetNechetDifference);
    }
}

