package Test7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 增强for循环，用于遍历数组内所有元素
 * */
public class ForEach {
    public static void main(String[] args){
        int[] nums = {1,2,63,42,92,2,7};

        //普通的for循环
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println();

        //增强for循环
        for(int n : nums){
            System.out.println(n);
        }

        //直接查看数组所有元素 Arrays.toString()方法
        System.out.println(Arrays.toString(nums));
    }
}
