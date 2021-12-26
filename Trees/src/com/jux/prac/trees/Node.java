package com.jux.prac.trees;

class Node<T>{	
	public Node<T> left;
	public Node<T> right;
	public T data;
	
	public Node() {
		this.left = null;
		this.right = null;
		this.data = null;
	}	
	
	public Node(T data) {
		this.left = null;
		this.right = null;		
		this.data = data;
	}
}