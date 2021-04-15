class Node
{
    int data;
    Node2 left, right;

    // Function to create a new binary tree node having a given key
    public Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Main
{
    // Recursive function to perform inorder traversal on the tree
    public static void inorder(Node2 root)
    {
        // return if the current node is empty
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        inorder(root.left);

        // Display the data part of the root (or current node)
        System.out.print(root.data + " ");

        // Traverse the right subtree
        inorder(root.right);
    }

    public static void main(String[] args)
    {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.right.left = new Node2(5);
        root.right.right = new Node2(6);
        root.right.left.left = new Node2(7);
        root.right.left.right = new Node2(8);

        inorder(root);
    }
}