
public class ListSum {
    private int order;

 public ListNode SumElem(ListNode list1, ListNode list2){
        int num1 =numFromList(list1);
        int num2 =numFromList(list2);
        num1 += num2;
        return listFromNum(num1);
    }

    private int numFromList(ListNode list){
        int num =0;
        order = list.getLength();
        for (int i =0; i< order; i++){
            num += list.getVal()*Math.pow(10, i);
            list = list.getNext();
        }
        return num;
    }

    private ListNode listFromNum(int num){
        ListNode list = new ListNode(num % 10);
        ListNode l = list;
        for (int i = 1; i<order; i++){
               int x = num % (int)(Math.pow(10, i+1)) - num % (int)(Math.pow(10, i));
               l.setNext(new ListNode(x));
               l = l.getNext();
           }
        return list;
     }

}
