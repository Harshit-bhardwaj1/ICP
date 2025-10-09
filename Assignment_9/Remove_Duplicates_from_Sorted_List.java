
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Remove_Duplicates_from_Sorted_List{
    public static void main(String[] args) {
        
    }
    public ListNode Duplicate(ListNode head,ListNode temp){
        if(temp.next==null){
            return head; 
        }
        if(temp.val==temp.next.val){
            temp.next=temp.next.next;
            return Duplicate(head, temp);
        }
        return Duplicate(head,temp.next);        
    }
}