import java.util.*;
public class OperationsOnBTreeUsingLinkedList {
	
	static Node root = null;
	static int value;
	static Scanner sc = new Scanner(System.in); 
	
	Deque<Node> queue = new LinkedList<Node>();
	
	static class Node{
		int key;
		Node left;
		Node right;
	}
	static Node newNode(int data) {
		Node temp = new Node();
		temp.key=data;
		temp.left=null;
		temp.right=null;
		return temp;
	}
	Node inserNode(Node root, int key) {
		Node newNode = newNode(key);//Create a new node
		if(root == null) {
			root = newNode;
			queue.add(root);
			return root;
			}
		else {
			Node node;
			node = queue.remove();
			System.out.println("parent is " + node.key);
			if(node.left == null) {
				node.left=newNode;
				queue.add(node.left);
				queue.addFirst(node);
				return root;
			}
			else if(node.right==null) {
				node.right=newNode;
				return root;
			}
				
		}
		return root;
	}
	public void levelbyLevel(Node root){
		Queue<Node> queue1 =new LinkedList<Node>();
		queue1.add(root);
		while(!queue1.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.key +" ");
		
		if (tempNode.left != null) {//enqueue Left
			queue1.add(tempNode.left);
		}
		if(tempNode.right != null) {// enqueue Right
			queue1.add(tempNode.right);
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationsOnBTreeUsingLinkedList bt = new OperationsOnBTreeUsingLinkedList();
		String status = "a";
		while(!status.equals("s")) {
			System.out.println("Enter value to insert -");
			value = sc.nextInt();
			root = bt.inserNode(root, value);
			System.out.println("Binary tree after insertion -");
			bt.levelbyLevel(root);
			System.out.println("Enter s to stop -");
			status = sc.next();
		}
		System.out.println("Program Completed successfully");
	}

}
