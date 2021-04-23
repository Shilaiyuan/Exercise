package nowcode;

public class BC85 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <=2019; i++){
//            考虑百位、十位和个位存在9
            if (i%1000/100 == 9 || i%100/10 == 9 || i%10 == 9){
                count ++;
            }
        }
        System.out.println(count);
    }
}
