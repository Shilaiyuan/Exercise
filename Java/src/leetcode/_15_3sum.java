package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * leetcode题号 15 三数之和,找出所有和为0且不重复的三元组
 *
 * */
public class _15_3sum {
    public List<List<Integer>> threeSum(int[] nums){
//        官方的题解首先对输入数组进行排序，在遍历时去除重复枚举
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> rets = new ArrayList<List<Integer>>() ;
//        选取第一个数遍历，对多遍历到 n-2项
        for (int i = 0; i < n - 2; i++){
//            对于本题来说三数之和要等于0，第一项必须小于等于0
            if (nums[0] > 0) break;
//            去掉开始几个相同的情况
            if (i > 0 && nums[i] == nums[i-1]) continue;
//            双指针法筛选符合要求的
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                if (nums[i] + nums[j] + nums[k] == 0){
                    rets.add(new ArrayList<>(Arrays.asList(nums[i],nums[j++],nums[k--])));
//                    遇见连续相同的数继续移动指针
//                    左侧
                    while(j < k && nums[j] == nums[j-1]) j++;
//                    右侧
                    while (j < k && nums[k] == nums[k+1]) k--;
                }else if (nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return rets;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '[' && str.charAt(i) != ']'){
                sb.append(str.charAt(i));
            }else continue;
        }
        String[] str2 = sb.toString().split(",");
        sb.setLength(0);
        int[] nums = new int[str2.length];
        for (int i = 0; i < str2.length; i++){
            nums[i] = Integer.parseInt(str2[i]);
        }
        _15_3sum sol = new _15_3sum();
        System.out.println(String.format("") + sol.threeSum(nums) + String.format(""));
    }
}
