public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    public Node<Key, Value> root; // Root node of the binary search tree

    public BinarySearchTree() {
        // Empty constructor
    }

    public int size() {
        return size(root);
    }

    // Recursive method to calculate the size of the subtree rooted at the given node
    private int size(Node x) {
        if (x == null) {
            return 0; // Tree is empty
        } else {
            return 1 + size(x.getLeft()) + size(x.getRight()); // Size is 1 (current node) + size of left subtree + size of right subtree
        }
    }

    public boolean isEmpty() {
        return root == null; // Returns true if the tree is empty (root is null)
    }

    // Recursive method to insert a key-value pair into the tree
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    // Recursive helper method for put operation
    private Node<Key, Value> put(Node<Key, Value> n, Key key, Value val) {
        if (n == null) {
            n = new Node<>(key, val, 1); // Create a new node if the current node is null
            return n;
        }
        if (n.getKey().compareTo(key) > 0) {
            n.setLeft(put(n.getLeft(), key, val)); // Recursively insert into the left subtree
        } else if (n.getKey().compareTo(key) < 0) {
            n.setRight(put(n.getRight(), key, val)); // Recursively insert into the right subtree
        }
        return n;
    }

    // Recursive method to retrieve the value associated with a key
    public Value get(Key key) {
        return get(root, key);
    }

    // Recursive helper method for get operation
    private Value get(Node<Key, Value> n, Key key) {
        if (n == null) {
            return null; // Key not found
        }
        if (n.getKey().compareTo(key) == 0) {
            return n.getValue(); // Return the value if the key is found
        } else if (n.getKey().compareTo(key) > 0) {
            return get(n.getLeft(), key); // Search in the left subtree
        } else {
            return get(n.getRight(), key); // Search in the right subtree
        }
    }

    // Checks if the tree contains a specific key
    public boolean contains(Key key) {
        return get(root, key) != null; // Returns true if the key is found in the tree
    }

    // Removes a key and its associated value from the tree and returns the value
    public Value remove(Key key) {
        Value v = get(key); // Retrieve the value associated with the key
        root = remove(root, key); // Remove the key from the tree
        return v;
    }

    // Recursive helper method for remove operation
    private Node remove(Node<Key, Value> n, Key key) {
        // Implementation of removing a node with a specific key
        // ...
        return n; // Returns the modified node
    }

    // Finds the key with the minimum value in the tree
    public Key min() {
        return min(root).getKey();
    }

    // Recursive helper method to find the node with the minimum key
    private Node<Key, Value> min(Node<Key, Value> n) {
        // Implementation to find the minimum key node in the tree
        // ...
        return n; // Returns the node with the minimum key
    }

    // Finds the key with the maximum value in the tree
    public Key max() {
        return max(root).getKey();
    }

    // Recursive helper method to find the node with the maximum key
    private Node<Key, Value> max(Node<Key, Value> n) {
        // Implementation to find the maximum key node in the tree
        // ...
        return n; // Returns the node with the maximum key
    }

    // Returns a string representation of the tree
    public String toString() {
        String temp = toString(root);
        temp = temp.substring(0, temp.length() - 2);
        return "{" + temp + "}";
    }

    // Recursive helper method to create a string representation of the tree
    private String toString(Node<Key, Value> n) {
        if (n == null) return ""; // Base case: empty subtree
        return toString(n.getLeft()) +
                n.getKey() + "=" + n.getValue() + ", " +
                toString(n.getRight());
    }
}