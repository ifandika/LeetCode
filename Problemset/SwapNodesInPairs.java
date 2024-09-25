/**
 * - Diberikan ListNode
 * - Tukar setiap 2 nilai antra nilai pertama dan kedua
 * - Input [1, 2, 3, 4]
 * - Output [2, 1, 4, 3]
 * 
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * Solution step(Recursive)
 * - Cek jika head atau head.next == null maka return head
 * - Buat objek ListNode untuk pointer objek pertama dan kedua
 * - Ubah pointer next objek pertama ke objek kedua
 * 			first.next = solution(head.next.next)
 * - 
 */
public class SwapNodesInPairs {

	public ListNode solution(ListNode head) {

	}
}