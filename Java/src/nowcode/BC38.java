package nowcode;
/**
 * 变种水仙花数
 * 简单粗暴的做法
 * */
public class BC38 {
    public static void main(String[] args){
//        跑了几分钟没跑出来的粗暴做法
//        int[] nums = new int[5];
//        for (int tenthound = 1; tenthound < 10; tenthound ++){
//            nums[0] = tenthound;
//            for (int thound = 0; thound < 10; thound ++){
//                nums[1] = thound;
//                for (int hundred = 0; hundred < 10; hundred ++){
//                    nums[2] = hundred;
//                    for (int ten = 0; ten < 10; ten ++){
//                        nums[3] = ten;
//                        for (int one = 0; one < 10; thound ++){
//                            nums[4] = one;
//                            int key = nums[0]*10000 + nums[1]*1000 + nums[2]*100 + nums[3] *10 + nums[4];
////                            五位数字从中间拆有4种拆法,但第二个数首位为0的时候，得舍去
////                            1-4拆分
//                            if (nums[1] != 0){
//                                if (nums[0] * (nums[1]*1000 + nums[2]*100 + nums[3]*10 + nums[4]) ==  key)
//                                    System.out.println(key +" ");
//                            }
//                            if (nums[2] != 0){
//                                if ((nums[0]*10 + nums[1]) * (nums[2]*100 + nums[3]*10 + nums[4]) ==  key)
//                                    System.out.println(key +" ");
//                            }
//                            if (nums[3] != 0){
//                                if ((nums[0]*100 + nums[1]*10 + nums[2]) * ( nums[3]*10 + nums[4]) ==  key)
//                                    System.out.println(key +" ");
//                            }
//                            if (nums[4] != 0){
//                                if ((nums[0]*1000 + nums[1]*100 + nums[2]*10 + nums[3]) * nums[4] ==  key)
//                                    System.out.println(key +" ");
//                            }
//                        }
//                    }
//                }
//            }
//        }
        for (int i = 10000; i< 100000; i++){
            int a = (i/10000)*(i%10000) + (i/1000)*(i%1000) + (i/100)*(i%100) + (i/10)*(i%10);
            if (i == a)
                System.out.print(i + " ");
        }
    }
}
