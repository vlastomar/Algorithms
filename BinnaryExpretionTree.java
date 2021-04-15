// Data structure to store a binary tree node
class Node3
{
    String val;
    Node3 left, right;

    Node3(String val)
    {
        this.val = val;
        this.left = this.right = null;
    }
}

class Main3
{
    // Utility function to check if a given node is a leaf node
    public static boolean isLeaf(Node3 node) {
        return node.left == null && node.right == null;
    }

    // Function to apply an operator `op` to values `x` and `y` and return the result
    public static double process(String op, double x, double y)
    {
        if (op == "+") { return x + y; }
        if (op == "-") { return x - y; }
        if (op == "×") { return x * y; }
        if (op == "/") { return x / y; }

        return 0;
    }

    // Recursive function to evaluate a binary expression tree
    public static double evaluate(Node3 root)
    {
        // base case: invalid input
        if (root == null) {
            return 0;
        }

        // the leaves of a binary expression tree are operands
        if (isLeaf(root)) {
            return Integer.valueOf(root.val);
        }

        // recursively evaluate the left and right subtree
        double x = evaluate(root.left);
        double y = evaluate(root.right);

        // apply the operator at the root to the values obtained in the previous step
        return process(root.val, x, y);
    }

    public static void main(String[] args)
    {
        Node3 root = new Node3("+");
        root.left = new Node3("×");
        root.right = new Node3("/");
        root.left.left = new Node3("-");
        root.left.right = new Node3("5");
        root.right.left = new Node3("21");
        root.right.right = new Node3("7");
        root.left.left.left = new Node3("10");
        root.left.left.right = new Node3("5");

        System.out.println("The value of the expression tree is " + evaluate(root));
    }
}
