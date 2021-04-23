package leetcode;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * leetcode题号11，盛水最多的容器
 * 双指针法
 * */
public class _11waterCup {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ret = 0;
        while(i < j){
//            判断短板，蓄水量等于 间距*短板高度
            ret = height[i] < height[j] ? Math.max(ret, (j - i) * (height[i++])):Math.max(ret, (j - i) * height[j--]);
        }
        return ret;
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
        int[] nums = new int[str2.length];
        for (int i = 0; i < str2.length; i++){
            nums[i] = Integer.parseInt(str2[i]);
        }
        _11waterCup sol = new _11waterCup();
        System.out.println(sol.maxArea(nums));
    }
}
