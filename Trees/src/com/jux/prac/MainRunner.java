package com.jux.prac;

import com.jux.prac.trees.SimpleBinaryTree;
import com.jux.prac.trees.Tree;

public class MainRunner {

	public static void main(String[] args) {
		
		Tree<String> tree = new SimpleBinaryTree<>();
		tree.insert("root");
		tree.insert("root.left");
		tree.insert("root.right");
		tree.insert("root.left.left");
		tree.insert("root.left.right");
		tree.bfTraversal();
	}

}
