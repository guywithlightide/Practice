/**
 * 
 */
package com.jux.prac.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Soham
 *
 */
public class SimpleBinaryTree<T> extends Tree<T>{
	 
	public SimpleBinaryTree() {
		this.height = getHeight();
	}

	@Override
	public void insert(T data) {
		if(root == null) {
			root = new Node<T>(data);
			return;
		}
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node<T> temp = queue.poll();
			if(temp.left == null) {
				temp.left = new Node<T>(data);
				break;
			}else {
				queue.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node<T>(data);
				break;
			}else {
				queue.add(temp.right);
			}			
		}		
	}

	@Override
	public void bfTraversal() {
		Queue<Node<T>> queue = new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()) {
			Node<T> current = queue.poll();
			System.out.print(current.data+" ");
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
		}		
	}

	@Override
	public void dfTraversal() {
		Stack<Node<T>> stack = new Stack<>();
		stack.push(this.root);
		while(!stack.isEmpty()) {
			Node<T> current = stack.pop();
			System.out.println(current.data+" ");
			if(current.left!=null)
				stack.push(current.left);
			if(current.right!=null)
				stack.push(current.right);
		}		
	}
	

	
}

