package datastructures;

public class DoublyLinkedNode extends Node{
	
	private DoublyLinkedNode previous, next;
	
	public DoublyLinkedNode(Object data){
		super(data);
	}
	
	public DoublyLinkedNode getPrevious(){
		return previous;
	}
	
	public void setPrevious(DoublyLinkedNode node){
		previous = node;
	}
	
	public DoublyLinkedNode getNext(){
		return next;
	}
	
	public void setNext(DoublyLinkedNode node){
		next = node;
	}
}
