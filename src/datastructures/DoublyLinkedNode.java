package datastructures;

public class DoublyLinkedNode extends Node{

	private DoublyLinkedNode next,previous;

	public DoublyLinkedNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedNode next) {
		this.next = next;
	}

	public DoublyLinkedNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedNode previous) {
		this.previous = previous;
	}

	public DoublyLinkedNode(Object data) {
		super(data);
	}

	public void appendToTail(Object d) {
		DoublyLinkedNode end = new DoublyLinkedNode(d);
		DoublyLinkedNode n = this;
		while (n.getNext() != null) {
			n = n.getNext();
		}
		n.setNext(end);
		end.setPrevious(n);
	}

	public DoublyLinkedNode deleteNode(DoublyLinkedNode head, Object d){
		DoublyLinkedNode n = head;
		
		if(n.getData().equals(d)){
			return head.getNext();
		}
		
		while(n.getNext() != null){
			if(n.getNext().getData().equals(d)){
				n.getNext().getNext().setPrevious(n);
				n.setNext(n.getNext().getNext());
				return head;
			}
		}
		
		return head;
	}
	
	public DoublyLinkedNode deleteNode(Object d){
		return deleteNode(this,d);
	}

	public DoublyLinkedNode reverse(DoublyLinkedNode n){
		if(n == null){
			return null;
		}
		
		DoublyLinkedNode temp = null;
		
		while(n.next != null){
			temp = n.getNext();
			n.setNext(n.getPrevious());
			n.setPrevious(temp);
			n = temp;
		}
		
		n.setNext(n.getPrevious());
		n.setPrevious(null);
		
		return n;
	}
	
	public DoublyLinkedNode reverse(){
		return reverse(this);
	}
	
	public String toString(DoublyLinkedNode n){
		StringBuffer buffer = new StringBuffer();
		while(n.getNext()!=null){
			buffer.append(n.getData());
			buffer.append(" <-> ");
		}
		buffer.append(n.getData());
		return buffer.toString();	
	}
	
	public String toString(){
		return toString(this);
	}
	
}
