package BubleSort;

public class Array {
    public static void main(String[] args) {

        BubleSort sortArray = new BubleSort();
        int[] array={10,3,8,12,5,0};
        array=sortArray.sort(array);

        for (int i=0;i<array.length;i++){

            System.out.println(array[i]);
        }

    }
}
