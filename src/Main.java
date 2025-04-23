public class Main {
    public static void main(String[] args) {
        // Create a hashtable with 100 buckets
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);

        // Add 10,000 random entries
        for (int i = 0; i < 10000; i++) {
            int f1 = (int)(Math.random() * 10000);
            int f2 = (int)(Math.random() * 10000);
            MyTestingClass key = new MyTestingClass(f1, f2);
            Student value = new Student(i, "Student" + i);
            table.put(key, value);
        }

        // Get bucket sizes from the helper method
        int[] bucketSizes = table.getBucketSizes();

        // Print the number of elements in each bucket
        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes[i] + " elements");
        }
        System.out.println("\n=== BST DEMO ===");

        BST<Integer, String> tree = new BST<>();

        // Add sample values to the BST
        tree.put(50, "Root");
        tree.put(30, "Left Child");
        tree.put(70, "Right Child");
        tree.put(20, "Left-Left");
        tree.put(40, "Left-Right");
        tree.put(60, "Right-Left");
        tree.put(80, "Right-Right");

        System.out.println("BST Size: " + tree.size());

        // In-order traversal output
        for (BST.KeyValue<Integer, String> elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        // Delete a key
        tree.delete(30);
        System.out.println("\nBST Size after deleting key 30: " + tree.size());

        System.out.println("BST In-Order Traversal After Deletion:");
        for (BST.KeyValue<Integer, String> elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

    }

}
