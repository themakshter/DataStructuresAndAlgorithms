package test;

import datastructures.SinglyLinkedNode;

public class LinkedListTest {
	public static void main(String[] args) {
		testSinglyLinkedList();
		return;
	}
	
	public static void testSinglyLinkedList(){
		int[] testNums = {1,2,3,4,5,6,7,8,9};
		SinglyLinkedNode n = new SinglyLinkedNode(0);
		for(int i : testNums){
			n.appendToTail(i);
		}
		System.out.println(n.toString());
	}
}
