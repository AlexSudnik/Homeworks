package hwClass;

import java.util.Arrays;

public class Massiv {

    private int [] arr;

    public Massiv(int[] arr) {
        this.arr = arr;
    }

    private int [] myArraySort(){
        Arrays.sort(arr);
        return arr;
    }


    private int [] myArrayMinMax(){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length -1];
//        ???????????????????????????????????
        return arr;

    }

    private void printArray (int [] arr){
        System.out.println(Arrays.toString(arr));
    }


}
