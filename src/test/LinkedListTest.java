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
		DoublyLinkedNode doubleList = (DoublyLinkedNode) addItems(new DoublyLinkedNode(null));
		reverseList(doubleList);
	}

	public static void testSinglyLinkedList(){
		SinglyLinkedNode singleList = (SinglyLinkedNode) addItems(new SinglyLinkedNode(null));
		reverseList(singleList);
	}
	
	public static LinkedListNode addItems(LinkedListNode n){
		int[] testNums = {1,2,3,4,5,6,7,8,9};
		n.setData(0);
		for(int i : testNums){
			n.appendToTail(i);
		}
		System.out.println(n.toString());
		return n;
	}
	
	public static void reverseList(LinkedListNode n){
		n = n.reverse();
		System.out.println(n.toString());
	}
}
