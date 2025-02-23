public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(5, "Apple");
        bst.put(3, "Banana");
        bst.put(7, "Cherry");
        bst.put(4, "Date");
        bst.put(6, "Fig");

        System.out.println("Inorder Traversal:");
        bst.inorder();

        System.out.println("Search Key 4: " + bst.get(4));
        System.out.println("Search Key 10: " + bst.get(10));
    }
}
