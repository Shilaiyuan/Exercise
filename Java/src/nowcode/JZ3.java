package nowcode;


import java.util.ArrayList;
class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}

public class JZ3 {
    private ArrayList<Integer> ret = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if (listNode == null){
            return ret;
        }
        ListNode pre = null;
        ListNode next = null;
        while(listNode != null){
            next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;
        }
        while (pre != null){
            ret.add(pre.val);
            pre = pre.next;
        }
        return ret;
    }

    public static void main(String[] args){
        ListNode input = new ListNode(67);
        float f = 1 ;
    }

}

