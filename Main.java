
public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode_1 = new ListNode(4);
        ListNode listNode_2 = new ListNode(5);

        listNode_1.setNext(listNode_2);
        listNode1.setNext(listNode_1);

        ListNode listNode2 = new ListNode(3);
        ListNode listNode1_1 = new ListNode(4);
        ListNode listNode1_2 = new ListNode(5);

        listNode1_1.setNext(listNode1_2);
        listNode1.setNext(listNode1_1);

        ListSum listSum = new ListSum();

        ListNode list = listSum.SumElem(listNode1, listNode2);
        for (int i = 0; i < 3; i++)
        {
            System.out.println(list.getVal());
            list = list.getNext();
        }
    }
}
