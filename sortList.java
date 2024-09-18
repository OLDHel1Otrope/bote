public ListNode sortList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next = null;
        ListNode first = sortList(head);
        ListNode secondHalf = sortList(second);
        return merge(first, secondHalf);
    }
