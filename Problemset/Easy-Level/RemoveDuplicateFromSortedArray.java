	Diberikan head dari sorted listNode, hapus semua duplikat sehingga elemen
hanya muncul satu saja. kembalikan hasil listNode yang tidak duplikat.

Contoh 1:
Input: head = 1, 1, 2, 2, 3
Output: 1, 2, 3
Penjelasan:
head = 1, 1, 2, 2, 3
n1 = 1 (pertama muncul)
n2 = 1 (nilai sudah muncul maka duplikat)
n3 = 2 (pertama muncul)
n4 = 2 (nilai sudah muncul maka duplikat)
n5 = 3 (pertama muncul)
maka hasil
	head = 1, 2, 3

Algoritma 1:
- Cek jika head null,blank
- Jelajah dari n1 - panjang listNode
- Ambil nilai pertama, lalu lanjut ke nilai kedua dan cek jika nilai kedua =
  nilai pertama maka lewati dan seterusnya.


class ListNode {
	int val;
	ListNode next;

	ListNode() {}

	ListNode(int val) { 
		this.val = val; 
	}

	ListNode(int val, ListNode next) { 
		his.val = val; this.next = next; 
	}
}

public class RemoveDuplicateFromSortedArray {
	
	public ListNode solution(ListNode head) {
		if(head == null) return null;
		ListNode ptr = head;
		while(ptr != null) {
			ListNode temp = ptr;
			while(temp != null && temp.val == ptr.val) {
				temp = temp.next;
			}
			ptr.next = temp;
			ptr = ptr.next;
		}
		return head;
	}
}