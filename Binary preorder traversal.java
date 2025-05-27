/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);              // Visit root
        preorder(node.left, result);       // Traverse left
        preorder(node.right, result); 
    }
}
/////////////////////////////
Reading input from user:
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
        
    }

    // Preorder Traversal: Root -> Left -> Right
    public static void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Recursively build binary tree from user input (preorder-style)
    public static Node buildTree(Scanner sc) {
        System.out.print("Enter node value (-1 for null): ");
        int val = sc.nextInt();

        if (val == -1) return null;

        Node node = new Node(val);
        node.left = buildTree(sc);
        node.right = buildTree(sc);

        return node;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = Node.buildTree(sc);  // Pass scanner to avoid creating multiple objects
        System.out.println("Preorder Traversal:");
        Node.preOrder(root);
    }
}
