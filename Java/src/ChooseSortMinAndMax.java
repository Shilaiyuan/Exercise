import java.util.Arrays;

/**
 * 二元选择排序
 * 每轮记录最小值和最大值，缩小排序范围
 * */
public class ChooseSortMinAndMax {
    protected static void selectionSort2(int[] arr){
//        i只需遍历一半
        for (int i = 0; i<arr.length/2; i++){
            int minIndex = i;
            int maxIndex = i;
            for(int j = 0; j<arr.length - i; j++){
                if (arr[minIndex] > arr[j]) minIndex = j;
                if (arr[maxIndex] < arr[j]) maxIndex = j;
            }
            if (minIndex == maxIndex) break;
//            将最小元素放置首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
//            若最大元素下标为i，由于minIndex与i已经交换位置，此时更新maxIndex的值
            if (maxIndex == i) maxIndex = minIndex;
//            将最大元素放置末尾
            int lastIndex = arr.length-1-i;
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void main(String[] args){
        int[] input = {7,6,3,1,5,2};
        selectionSort2(input);
        System.out.println(Arrays.toString(input));
    }


}
