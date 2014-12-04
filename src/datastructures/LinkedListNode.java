package datastructures;

public abstract class LinkedListNode extends Node {

	public LinkedListNode(Object data) {
		super(data);
	}
	
	public abstract void appendToTail(LinkedListNode node, Object d);
	public void appendToTail(Object d){
		appendToTail(this,d);
	}
	
	public abstract LinkedListNode delete(LinkedListNode node,Object d);
	
	public LinkedListNode deleteNode(Object d){
		return delete(this, d);
	}
	
	public abstract String toString(LinkedListNode node);
	public String toString(){
		return toString(this);
	}
	
	public abstract LinkedListNode reverse(LinkedListNode node);
	public LinkedListNode reverse(){
		return reverse(this);
	}
	
}
