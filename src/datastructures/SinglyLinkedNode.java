package datastructures;

public class SinglyLinkedNode extends Node {
	private SinglyLinkedNode next;

	public SinglyLinkedNode getNext() {
		return next;
	}

	public void setNext(SinglyLinkedNode next) {
		this.next = next;
	}

	public SinglyLinkedNode(Object data) {
		super(data);
	}

	public void appendToTail(Object d) {
		SinglyLinkedNode end = new SinglyLinkedNode(d);
		SinglyLinkedNode n = this;
		while (n.getNext() != null) {
			n = n.getNext();
		}
		n.setNext(end);
	}

	public SinglyLinkedNode deleteNode(SinglyLinkedNode head, Object d){
		SinglyLinkedNode n = head;
		
		if(n.getData().equals(d)){
			return head.getNext();
		}
		
		while(n.getNext() != null){
			if(n.getNext().getData().equals(d)){
				n.setNext(n.getNext().getNext());
				return head;
			}
		}
		
		return head;
	}
	
	public SinglyLinkedNode deleteNode(Object d){
		return deleteNode(this,d);
	}

	public SinglyLinkedNode reverse(SinglyLinkedNode n){
		if(n == null){
			return null;
		}
		
		SinglyLinkedNode previous = null;
		SinglyLinkedNode temp = null;
		
		while(n.getNext() != null){
			temp = n.getNext();
			n.setNext(previous);
			previous = n;
			n = temp;
		}
		
		n.setNext(previous);
		
		return n;
	}
	
	public SinglyLinkedNode reverse(){
		return reverse(this);
	}

	public String toString(SinglyLinkedNode n){
		StringBuffer buffer = new StringBuffer();
		while(n.getNext()!=null){
			buffer.append(n.getData());
			buffer.append(" -> ");
		}
		buffer.append(n.getData());
		return buffer.toString();
	}
	
	
}
