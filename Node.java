package BinaryTree;

public class Node {
	Node left;
	Node right;
	int root;
	
	
	public Node (int value) {
		this.root = value;
		this.right = new Node();
		this.left = new Node ();
	}
	

	public Node() {
		this.root = (Integer) 0;
	}


	public void setRight (int value){
		this.right = new Node(value);
	}
	public void setLeft (int value){
		this.left = new Node(value);
	}
	
	public void add(int value) {
		if (value < this.root){
			if (this.left.root == (Integer) 0) this.setLeft(value);
			else this.left.add(value);
		}
		else if (value > this.root){
			if (this.right.root == (Integer) 0) this.setRight(value);
			else this.right.add(value);
		}
		
	}
	
	public void tranverse () {
		if (this.left.root != 0)
			this.left.tranverse();
		System.out.println(this.root);
		if (this.right.root != 0 )
			this.right.tranverse();
	}
	
	public boolean contains (int search) {
		
		if (search == this.root){
			return true;
		}
		if (search < this.root && this.root != 0){
			return this.left.contains(search);
		}
		else if (search > this.root && this.root != 0){
			return this.right.contains(search);
		}
		return false;
	}
	
	

}
