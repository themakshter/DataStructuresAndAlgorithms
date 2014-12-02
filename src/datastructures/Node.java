package datastructures;

public class Node {
	
	private Object data;
	
	public Node(Object data){
		this.data = data;
	}
	
	public void setData(Object newData){
		data = newData;
	}
	
	public Object getData(){
		return data;
	}
	
}
