package com.jux.prac.trees;

public abstract class Tree<T> {

	int height;
	
	Node<T> root;
	
	public int getHeight() {
		return height(root);
	}
	
	private int height(Node<T> node) {
		if(this.root == null) {
			return 0;
		}else {
			int lHeight = height(node.left);
			int rHeight = height(node.right);
			if(lHeight > rHeight)
				return lHeight+1;
			else
				return rHeight+1;
		}		
	}
	public abstract void insert(T node);
	public abstract void bfTraversal();
	public abstract void dfTraversal();
}
