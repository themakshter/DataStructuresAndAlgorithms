package datastructures;

public class SinglyLinkedNode extends LinkedListNode {
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

	@Override
	public void appendToTail(LinkedListNode node, Object d) {
		SinglyLinkedNode end = new SinglyLinkedNode(d);
		SinglyLinkedNode n = (SinglyLinkedNode) node;
		while (n.getNext() != null) {
			n = n.getNext();
		}
		n.setNext(end);
	}

	@Override
	public LinkedListNode delete(LinkedListNode node, Object d) {
		SinglyLinkedNode head = (SinglyLinkedNode) node;
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

	@Override
	public String toString(LinkedListNode node) {
		SinglyLinkedNode n = (SinglyLinkedNode) node;
		StringBuffer buffer = new StringBuffer();
		while(n.getNext()!=null){
			buffer.append(n.getData());
			buffer.append(" -> ");
			n = n.getNext();
		}
		buffer.append(n.getData());
		return buffer.toString();
	}

	@Override
	public LinkedListNode reverse(LinkedListNode node) {
		SinglyLinkedNode n = (SinglyLinkedNode) node;
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
	
}
