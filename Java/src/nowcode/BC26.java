package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 根据三角形3跳变a,b,c计算三角形的周长和面积
 * 输入：一行，中间一个空格隔开,分别表示三边 int类型
 * 输出：周长 ：int类型 面积：double类型
 * */
public class BC26 {
//    判断是否能生成三角形
    protected static boolean run(double[] arrays){
        if (arrays.length != 3) return false;
//        结果不必考虑数组连续性，直接对原数组进行排序
        Arrays.sort(arrays);
//        两边之和，两边之差
        if (arrays[0] + arrays[1] <= arrays[2] || arrays[2] - arrays[0] >= arrays[1])
            return false;
        return true;
    }

//    计算周长
    protected static double circus(double[] nums){
        return Arrays.stream(nums).sum();
//        return (nums[0] + nums[1] + nums[2]);
    }

//    计算面积
    protected static double Area(double[] nums){
//        double p = (nums[0] + nums[1] + nums[2])/2.00;
        double p = circus(nums)/2;
        return Math.sqrt(p * (p - nums[0]) * (p - nums[1]) * (p - nums[2]));
    }

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String [] str = input.readLine().split(" ");
        double[] a= new double[str.length];
        for (int i = 0; i<a.length; i++)
            a[i] = Double.parseDouble(str[i]);
        while (run(a)){
            System.out.println("周长：" + String.format("%.2f", circus(a)) +"\n面积：" + String.format("%.2f", Area(a)));
            break;
        }
    }
}
