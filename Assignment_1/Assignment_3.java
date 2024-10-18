//Write a program to read ‘n’ integers and store them in a 
//Binary search tree and display the nodes level wise.

package New_Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Assignment_3 {
    TreeNode root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {

        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val) {
            root.left = insertRec(root.left, key);
        } else if (key > root.val) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void levelOrder() {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}



