# BinarySearchTrees

This Java implementation includes two classes: BinarySearchTree and Main. The BinarySearchTree class defines a generic binary search tree structure, allowing the user to perform operations such as insertion, retrieval, deletion, and more on key-value pairs. The Main class provides a usage of the BinarySearchTree class.

**BinarySearchTree Class**

public Node<Key, Value> root: Root node of the binary search tree

*Constructor*

public BinarySearchTree(): Empty constructor

*Methods*

public int size(): Returns the size of the tree

public boolean isEmpty(): Returns true if the tree is empty

public void put(Key key, Value value): Inserts a key-value pair into the tree

public Value get(Key key): Retrieves the value associated with a given key

public boolean contains(Key key): Checks if the tree contains a specific key

public Value remove(Key key): Removes a key and its associated value from the tree

public Key min(): Returns the key with the minimum value in the tree

public Key max(): Returns the key with the maximum value in the tree

public String toString(): Returns a string representation of the tree
