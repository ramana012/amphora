package amphora;

import java.util.LinkedList;
import java.util.List;



import java.util.LinkedList;


class Node implements NodeInter {
	private int age;
	private String name;
	private List<Node> chaild;
	private Node parent;

	

	
	public Node(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Node> getChaild() {
		return chaild;
	}
	public void setChaild(List<Node> child) {
		this.chaild = child;
		for(Node chaild1 : child){
			chaild1.setParent(this);
		}
	}
	
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	
	
	public static void LevelOrderTraversal(Node root){
		
		
	}
	
}
