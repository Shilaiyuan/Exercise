package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * leetcode 题号377 给定一个不同整数组成的数组nums和target，从nums中返回target的元素组合个数,不同的序列会被视为不同的组合
 * 输入两行 一行为整型数组nums，一行为整型数据target
 * 测试样例未说明是否有序，但表现出的似乎是sort过的
 * 初看时有感觉像是跳台阶的问题，翻看题解时果然有用类似的思想的,提交使用dongman的代码
 * */
public class _377_CombineSumV4 {
    public int combinationSum4(int[] nums, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++){
            for (int num : nums){
                if (i - num >= 0){
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
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
        int target = Integer.parseInt(bf.readLine());
        _377_CombineSumV4 sol = new _377_CombineSumV4();
        System.out.println(sol.combinationSum4(nums, target));
    }
}
