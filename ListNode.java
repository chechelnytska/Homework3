import java.awt.*;
import java.lang.reflect.Array;

/**
 * Created by marina on 20.11.16.
 */
public class ListNode {
    private int val;
    private ListNode next;
    private int length;

    public ListNode(int x){
        val =x;
        length =1;
        next = null;
    }

    public  ListNode(){
        length = 0;
        next = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
        length++;
    }

    public int getLength() {
        return length;
    }
}
