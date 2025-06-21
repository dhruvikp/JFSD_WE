package com.tree;


class TreeNode {
	int data;
	TreeNode left, right;
	
	TreeNode(int value) {
		this.data = value;
		this.left = this.right = null;
	}
}

public class BinaryTreeTraversal {

	void inorder(TreeNode node) {
		if(node == null) return;
		
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	
	void preorder(TreeNode node) {
		if(node == null) return;
		
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	void postorder(TreeNode node) {
		if(node == null) return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}
	
	
	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right.right = new TreeNode(6);
		
		System.out.println("Inorder traversal:");
		tree.inorder(root);
		
		System.out.println("\nPreorder traversal:");
		tree.preorder(root);
		
		System.out.println("\nPostorder traversal:");
		tree.postorder(root);
		
		
	}
}
