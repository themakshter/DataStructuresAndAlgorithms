package datastructures;

public class Queue {
	SinglyLinkedNode first,last;
	
	public void enqueue(Object item){
		if(first == null){
			last = new SinglyLinkedNode(item);
			first = last;
		}else{
			last.setNext(new SinglyLinkedNode(item));
			last = last.getNext();
		}
	}
	
	public Object dequeue(){
		if(first!=null){
			Object item = first.getData();
			first = first.getNext();
			return item;
		}
		return null;
	}
	
	public String toString(){
		return first.toString();
	}
	
}
