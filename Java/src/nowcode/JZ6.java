package nowcode;
/**
 * 输出一个旋转数组的最小值
 * 方法：二分法查找
 * */
public class JZ6 {
    protected static int minNumberInRotateArray(int[] array){
        if (array.length == 0||array == null)
            return 0;
        int left = 0;
        int middle;
        int right = array.length-1;
        while(left<right){
            if (array[left] < array[right]) return array[left];
            middle = (left + right)/2;
            if (array[middle] > array[left])
                left = middle + 1;
            else if (array[middle] < array[right])
                right = middle;
            else left++;
        }
        return array[left];
    }

    public static void main(String[] args){
        int[] input1 = {3,4,5,1,2};
        int[] input2 = {1,0,1,1,1};
        System.out.println(minNumberInRotateArray(input1));
        System.out.println(minNumberInRotateArray(input2));
    }
}
