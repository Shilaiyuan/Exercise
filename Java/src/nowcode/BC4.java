package nowcode;
//小飞机
public class BC4 {
    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                switch(i){
                    case 0:
                        System.out.printf("     **     ");
                        System.out.println();break;
                    case 1:
                        System.out.printf("************");
                        System.out.println();break;
                    case 2:
                        System.out.printf("    *  *    ");
                        System.out.println();break;
                    default:break;
                }
            }
        }
    }
}
