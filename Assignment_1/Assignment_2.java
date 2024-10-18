// Write menu driven program  for Binary Search Tree. The menu includes 
//-	Create a Binary Search Tree
//-	Display
//-	Delete a given element from Binary Search Tree
package New_Assignment;
public class Assignment_2 {
	 Node root;
	    void insert(int data) {
	        root = insertRec(root, data);
	    }
	    Node insertRec(Node root, int data) {
	        if (root == null) {
	            root = new Node(data);
	            return root;
	        }
	        if (data < root.data) {
	            root.left = insertRec(root.left, data);
	        } else if (data > root.data) {
	            root.right = insertRec(root.right, data);
	        }
	        return root;
	    }
	    void inorder(Node node) {
	        if (node != null) {
	            inorder(node.left);
	            System.out.print(node.data + " ");
	            inorder(node.right);
	        }
	    }
	    void display() {
	        inorder(root);
	        System.out.println();
	    }   
	    void delete(int data) {
	        root = deleteRec(root, data);
	    }
	    Node deleteRec(Node root, int data) {
	        if (root == null) {
	            return root;
	        }

	        if (data < root.data) {
	            root.left = deleteRec(root.left, data);
	        } else if (data > root.data) {
	            root.right = deleteRec(root.right, data);
	        } else {
	           
	            if (root.left == null) {
	                return root.right;
	            } else if (root.right == null) {
	                return root.left;
	            }

	           
	            root.data = minValue(root.right);

	           
	            root.right = deleteRec(root.right, root.data);
	        }
	        return root;
	    }
	    int minValue(Node root) {
	        int minValue = root.data;
	        while (root.left != null) {
	            minValue = root.left.data;
	            root = root.left;
	        }
	        return minValue;
	    }
	}