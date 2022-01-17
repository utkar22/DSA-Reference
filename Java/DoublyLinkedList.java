public class DoublyLinkedList {
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	Node head, tail = null;
	
	public void addNode(int data){
		Node newNode = new Node(data);
		
		if (head==null){
			head=tail=newNode;
			head.previous=null;
			tail.next=null;						
		}
		else{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	
	public void show (){
		Node current = head;
		
		if (current==null){
			System.out.println(-1);
		}
		while (current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public void delete_node (Node node){
		node.previous.next=node.next;
		node.next.previous=node.previous;
	}
}
