public class Main {
    public static void main(String[] args) {
        // Create a BinarySearchTree with String keys and Integer values
        BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();

        // Print the size and emptiness status of the BST
        System.out.println("BST Size: " + bst.size());
        System.out.println("Is BST empty?: " + bst.isEmpty());

        // Insert elements into the BST
        bst.put("A", 1);
        bst.put("B", 2);
        bst.put("C", 3);
        bst.put("D", 4);
        bst.put("E", 5);
        bst.put("F", 6);
        bst.put("G", 7);
        bst.put("H", 8);
        bst.put("I", 9);
        bst.put("J", 10);

        // Check if the tree contains specific keys
        System.out.println("Does tree contain key (J)? " + bst.contains("J"));
        System.out.println("Does tree contain key (K)? " + bst.contains("K"));

        // Print the size and emptiness status of the BST after insertion
        System.out.println("BST Size: " + bst.size());
        System.out.println("Is BST empty?: " + bst.isEmpty());

        // Print all nodes in the BST
        System.out.println("All nodes: " + bst.toString());

        // Retrieve and print values for specific keys
        System.out.println("A: " + bst.get("A"));
        System.out.println("B: " + bst.get("B"));
        System.out.println("C: " + bst.get("C"));
        System.out.println("D: " + bst.get("D"));
        System.out.println("E: " + bst.get("E"));
        System.out.println("F: " + bst.get("F"));
        System.out.println("G: " + bst.get("G"));
        System.out.println("H: " + bst.get("H"));
        System.out.println("I: " + bst.get("I"));
        System.out.println("J: " + bst.get("J"));

        // Print keys with maximum and minimum values in the BST
        System.out.println("Key with max value: " + bst.max());
        System.out.println("Key with min value: " + bst.min());

        // Remove values for specific keys and print the removed values
        System.out.println("Value removed: " + bst.remove("A"));
        System.out.println("Value removed: " + bst.remove("B"));
        System.out.println("Value removed: " + bst.remove("C"));

        // Print all nodes in the BST after removal
        System.out.println("All nodes: " + bst.toString());
    }
}