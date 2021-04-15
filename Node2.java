import java.util.Stack;

// Data structure to store a binary tree node
class Node2
{
    int data;
    Node2 left, right;

    // Function to create a new binary tree node having a given key
    public Node2(int key)
    {
        data = key;
        left = right = null;
    }
}

class Main2
{
    // Iterative function to perform inorder traversal on the tree
    public static void inorderIterative(Node2 root)
    {
        // create an empty stack
        Stack<Node2> stack = new Stack();

        // start from the root node (set current node to the root node)
        Node2 curr = root;

        // if the current node is null and the stack is also empty, we are done
        while (!stack.empty() || curr != null)
        {
            // if the current node exists, push it into the stack (defer it)
            // and move to its left child
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                // otherwise, if the current node is null, pop an element from
                // the stack, print it, and finally set the current node to its
                // right child
                curr = stack.pop();
                System.out.print(curr.data + " ");

                curr = curr.right;
            }
        }
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

        inorderIterative(root);
    }
}
