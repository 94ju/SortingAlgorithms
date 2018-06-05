package BubleSort;

public class BubleSort {

    public int[] sort(int[] sortArray){
        int temp;

        for (int i=0;i<(sortArray.length);i++){
            for(int j=0;j<(sortArray.length-1);j++){
                if (sortArray[j]>sortArray[j+1]) {
                    temp=sortArray[j];
                    sortArray[j]=sortArray[j+1];
                    sortArray[j+1]=temp;
                }
            }
        }

        return sortArray;
    }
}
