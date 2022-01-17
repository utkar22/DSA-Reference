
public class BinarySearchTree {
	
	public static class Node_BST{
		int data;
		Node_BST left;
		Node_BST right;
		
		public Node_BST(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	Node_BST root;
	
	public BinarySearchTree(){
		root=null;
	}
	
	public void insert(int data){
		Node_BST newNode = new Node_BST(data);
		
		if (root==null){
			root=newNode;
			return;
		}
		else{
			Node_BST current=root;
			Node_BST parent=null;
			
			while(true){
				parent=current;
				
				if (data<current.data){
					current=current.left;
					if (current==null){
						parent.left=newNode;
						return;
					}
				}
				else{
					current=current.right;
					if (current==null){
						parent.right=newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node_BST minNode(Node_BST root) {  
        if (root.left == null){
        	return root;  
        }  
        else{
        	return minNode(root.left);
        }
            
    }
	
    public Node_BST deleteNode(Node_BST node, int value) {  
        if(node == null){  
            return null;  
         }  
        else {
            if(value < node.data)  
                node.left = deleteNode(node.left, value);  
 
            else if(value > node.data)  
                node.right = deleteNode(node.right, value);  
 
            else {  
                if(node.left == null && node.right == null)  
                    node = null;  
 
                else if(node.left == null) {  
                    node = node.right;  
                }  

                else if(node.right == null) {  
                    node = node.left;  
                }  
  
                else {   
                    Node_BST temp = minNode(node.right);  
                    node.data = temp.data;  
                    node.right = deleteNode(node.right, temp.data);  
                }  
            }  
            return node;  
        }  
    }

}
