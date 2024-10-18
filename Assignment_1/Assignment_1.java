// Write menu driven program  for Binary Search Tree. The menu includes 
//-	Create a Binary Search Tree
//-	Traverse it by using Preorder and Post order traversing technique
package New_Assignment;
public class Assignment_1 {
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
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }   
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }   
    void preorder() {
        preorder(root);
        System.out.println();
    }
    void postorder() {
        postorder(root);
        System.out.println();
    }
}