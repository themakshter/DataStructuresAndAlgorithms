package datastructures;

public class DoublyLinkedNode extends LinkedListNode {

	private DoublyLinkedNode next, previous;

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

	@Override
	public void appendToTail(LinkedListNode node, Object d) {
		DoublyLinkedNode end = new DoublyLinkedNode(d);
		DoublyLinkedNode n = (DoublyLinkedNode) node;
		while (n.getNext() != null) {
			n = n.getNext();
		}
		n.setNext(end);
		end.setPrevious(n);
	}

	@Override
	public LinkedListNode delete(LinkedListNode node, Object d) {
		DoublyLinkedNode head = (DoublyLinkedNode) node;
		DoublyLinkedNode n = head;
		if (n.getData().equals(d)) {
			return head.getNext();
		}

		while (n.getNext() != null) {
			if (n.getNext().getData().equals(d)) {
				n.getNext().getNext().setPrevious(n);
				n.setNext(n.getNext().getNext());
				return head;
			}
		}

		return head;
	}

	@Override
	public String toString(LinkedListNode node) {
		DoublyLinkedNode n = (DoublyLinkedNode) node;
		StringBuffer buffer = new StringBuffer();
		while (n.getNext() != null) {
			buffer.append(n.getData());
			buffer.append(" <-> ");
			n = n.getNext();
		}
		buffer.append(n.getData());
		return buffer.toString();
	}

	@Override
	public LinkedListNode reverse(LinkedListNode node) {
		DoublyLinkedNode n = (DoublyLinkedNode) node;
		if (n == null) {
			return null;
		}

		DoublyLinkedNode temp = null;

		while (n.next != null) {
			temp = n.getNext();
			n.setNext(n.getPrevious());
			n.setPrevious(temp);
			n = temp;
		}

		n.setNext(n.getPrevious());
		n.setPrevious(null);

		return n;
	}

}
