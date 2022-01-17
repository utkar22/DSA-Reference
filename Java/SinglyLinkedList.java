public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	Node head, tail = null;
	
	public void addNode (int data){
		Node newNode = new Node(data);
		
		if (head==null){
			head=tail=newNode;
			tail.next=null;
		}
		else{
			tail.next=newNode;
			
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
	
	public void delete (int data){
		Node current = head;
		
		if (current.data==data){
			head=current.next;
		}
		
		while (current.next!=null){
			if (current.next.data==data){
				if (current.next.next!=null){
					current.next=current.next.next;
				}
				else{
					current.next=null;
					tail=current;
				}
			}
		}
	}
}
