public class Main {
    public static void main(String[] args) {
        BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();
        System.out.println("BST Size: " + bst.size());
        System.out.println("Is BST empty?: " + bst.isEmpty());

        bst.put("A",1);
        bst.put("B",2);
        bst.put("C",3);
        bst.put("D",4);
        bst.put("E",5);
        bst.put("F",6);
        bst.put("G",7);
        bst.put("H",8);
        bst.put("I",9);
        bst.put("J",10);

        System.out.println("Does tree contain key (J)? " + bst.contains("J"));
        System.out.println("Does tree contain key (K)? " + bst.contains("K"));

        System.out.println("BST Size: " + bst.size());
        System.out.println("Is BST empty?: " + bst.isEmpty());

        System.out.println("All nodes: " + bst.toString());

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

        System.out.println("Key with max value: " + bst.max());
        System.out.println("Key with min value: " + bst.min());

        System.out.println("Value removed: " + bst.remove("A"));
        System.out.println("Value removed: " + bst.remove("B"));
        System.out.println("Value removed: " + bst.remove("C"));

        System.out.println("All nodes: " + bst.toString());
    }
}