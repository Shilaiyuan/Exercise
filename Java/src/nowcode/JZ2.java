package nowcode;

public class JZ2 {
    public String replacSpace(String s){
        String ret = s.replace(" ","%20");
        return  ret;
    }

    public static void main(String[] args){
        JZ2 temp = new JZ2();
        System.out.println(temp.replacSpace("We Are Happy"));
    }
}
