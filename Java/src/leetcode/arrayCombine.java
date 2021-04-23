package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 合并两个数组
 * */
public class arrayCombine {
    public void merge(int[] nums1, int m, int[] nums2, int n){
//        使用双指针来实现,p1为nums1头部指针，p2为nums2头部指针
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
//        cur为合并后数组下一个元素
        int cur;
        while(p1 < m || p2 < n){
//            nums1取完的情况
            if (p1 == m){
                cur = nums2[p2++];
            }else if (p2 == n){
//                nums2取完的情况
                cur = nums1[p1++];
            }else if (nums1[p1] < nums2[p2]){
//                取nums1与nums2之间的较小值
                cur = nums1[p1++];
            }else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i){
            nums1[i] = sorted[i];
        }
        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args)throws IOException{
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////        获取输入
//        String [] nums1 = bf.readLine().replace("]","").replace("[","").split(",");
//        int m = Integer.parseInt(bf.readLine());
//        String [] nums2 = bf.readLine().replace("]","").replace("[","").split(",");
//        int n = Integer.parseInt(bf.readLine());
////        初始化合成后的数组
//        int[] ret = new int[m + n];
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < m; i++){
//            sb.append(nums1[i]);
//            if (i < m-1)
//                sb.append(",");
//        }
//        if (n != 0 ) sb.append(",");
//        for (int j = 0; j < n; j++){
//            sb.append(nums2[j]);
//            if (j < n-1)
//                sb.append(",");
//        }
////        获得合并后的字符串
//        String[] s = sb.toString().replace("[","").replace("]","").split(",");
//        sb.setLength(0);
//        sb.append("[");
//        for (int k = 0; k < ret.length; k++){
//            ret[k] = Integer.parseInt(s[k]);
//        }
//        Arrays.sort(ret);
//        for (int l = 0; l < ret.length; l++){
//            sb.append(ret[l]);
//            if (l < ret.length - 1)
//                sb.append(",");
//        }
//        sb.append("]");
//        System.out.print(sb);
//        sb.setLength(0);
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[]nums2 = {2,5,6};
        int n = 3;
        arrayCombine sol = new arrayCombine();
        sol.merge(nums1,m,nums2,n);
    }
}
