package nowcode;

public class JZ1 {
    public boolean Find(int target, int [][] array) {
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(target == array[i][j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        JZ1 sol = new JZ1();
        int[][] temp ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        sol.Find(7,temp);
        System.out.println(sol.Find(7,temp));
    }
}
