import java.util.Arrays;

/**选择排序寻找最小值*/
public class ChooseSortMinIndex {
    private static int minIndex;
    protected static void selectionSort(int[] arr){
        for(int i =0; i <arr.length-1; i++){
            minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args){
        int[] test = {5,3,4,7,9,6};
        selectionSort(test);
        System.out.println(Arrays.toString(test));
    }

}
