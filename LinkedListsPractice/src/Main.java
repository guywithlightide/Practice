
class Node{
	int data;
	Node next;
	public Node() {
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Sll {
	private Node headNode;
	private Node lastNode;

	public Sll() {
		this.headNode = new Node();
		this.lastNode = this.headNode;
	}

	public void append(int data) {
		Node node = new Node(data);
		this.lastNode.next = node;
		this.lastNode = node;
		this.headNode.data++;
	}

	public void print() {
		Node curr = this.headNode.next;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
	}
	
	public int length() {
		return this.headNode.data;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Sll sll = new Sll();
		sll.append(1);
		sll.append(2);
		sll.append(3);
		sll.print();
	}
}
