package test;

import datastructures.DoublyLinkedNode;
import datastructures.LinkedListNode;
import datastructures.SinglyLinkedNode;

public class LinkedListTest {
	public static void main(String[] args) {
		testSinglyLinkedList();
		testDoublyLinkedList();
		return;
	}
	
	private static void testDoublyLinkedList() {
		addItems(new DoublyLinkedNode(null));
	}

	public static void testSinglyLinkedList(){
		addItems(new SinglyLinkedNode(null));
	}
	
	public static void addItems(LinkedListNode n){
		int[] testNums = {1,2,3,4,5,6,7,8,9};
		n.setData(0);
		for(int i : testNums){
			n.appendToTail(i);
		}
		System.out.println(n.toString());
	
	}
}
