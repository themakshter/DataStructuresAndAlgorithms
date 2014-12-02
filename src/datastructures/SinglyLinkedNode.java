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
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public SinglyLinkedNode deleteNode(SinglyLinkedNode head, Object d){
		SinglyLinkedNode n = head;
		
		if(n.getData().equals(d)){
			return head.next;
		}
		
		while(n.next != null){
			if(n.getData().equals(d)){
				n.next = n.next.next;
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
		
		while(n.next != null){
			temp = n.next;
			n.next = previous;
			previous = n;
			n = temp;
		}
		
		n.next = previous;
		
		return n;
	}
	
	public SinglyLinkedNode reverse(){
		return reverse(this);
	}

}
