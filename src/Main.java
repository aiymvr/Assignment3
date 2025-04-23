public class Main {
    public static void main(String[] args) {
        // ============================
        // MyHashTable Usage Section
        // ============================

        // Create a hash table with 100 buckets
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);

        // Add 10,000 random entries to the hash table
        for (int i = 0; i < 10000; i++) {
            int f1 = (int)(Math.random() * 10000); // generate first feature
            int f2 = (int)(Math.random() * 10000); // generate second feature

            // Create key and value objects
            MyTestingClass key = new MyTestingClass(f1, f2);
            Student value = new Student(i, "Student" + i);

            // Put the key-value pair into the hash table
            table.put(key, value);
        }

        // Get array representing the number of elements in each bucket
        int[] bucketSizes = table.getBucketSizes();

        // Display how many elements are in each bucket
        System.out.println("----- Hash Table Bucket Distribution -----");
        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes[i] + " elements");
        }

        // ============================
        // BST (Binary Search Tree) Usage Section
        // ============================

        System.out.println("\n===== BST (Binary Search Tree) DEMO =====");

        // Create a binary search tree with Integer keys and String values
        BST<Integer, String> tree = new BST<>();

        // Insert key-value pairs into the BST
        tree.put(50, "Root");
        tree.put(30, "Left Child");
        tree.put(70, "Right Child");
        tree.put(20, "Left-Left");
        tree.put(40, "Left-Right");
        tree.put(60, "Right-Left");
        tree.put(80, "Right-Right");

        // Display the total number of elements in the tree
        System.out.println("BST Size: " + tree.size());

        // In-order traversal of the BST with key-value access
        System.out.println("In-order traversal of BST:");
        for (BST.KeyValue<Integer, String> elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        // Delete a key (30) and show updated size and traversal
        tree.delete(30);
        System.out.println("\nBST Size after deleting key 30: " + tree.size());

        System.out.println("BST In-Order Traversal After Deletion:");
        for (BST.KeyValue<Integer, String> elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}
