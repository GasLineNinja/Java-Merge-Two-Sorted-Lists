import java.util.*;
public class ListNode {
		int val;
		ListNode next;
		
		public ListNode(int val) { 
			this.val = val; 
			this.next = null; 
			}
		
		public void addNode(int val) {
			ListNode newNode = new ListNode(val);
			
			if(head == null) {
				
				head = newNode;
				tail = newNode;
			}
			else;
			
			tail.next = newNode;
			tail = newNode;
		}

		public ListNode head = null;
		public ListNode tail = null;
	}