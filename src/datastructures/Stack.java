package datastructures;

public class Stack {
	private SinglyLinkedNode top;
	
	public void push(Object item){
		SinglyLinkedNode n = new SinglyLinkedNode(item);
		n.setNext(top);
		top = n;
	}
	
	public Object pop(){
		if(top!=null){
			Object item = top.getData();
			top = top.getNext();
			return item;
		}
		return null;
	}
	
	public Object peek(){
		return top.getData();
	}
	
}
