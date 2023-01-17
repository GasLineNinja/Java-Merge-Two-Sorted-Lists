import java.util.*;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode list1 = new ListNode(0);
		ListNode list2 = new ListNode(0);
		list1.addNode(1);
		list1.addNode(2);
		list1.addNode(4);
		
		list2.addNode(1);
		list2.addNode(3);
		list2.addNode(4);
		
		mergeTwoLists(list1, list2);
		
	}
	
public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		
		
		
		return list1;

	}
}
	
	
	
	
	

	

