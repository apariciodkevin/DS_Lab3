public class aparicio_lab3 {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(3);
        bst.insert(10);
        bst.insert(20);
        bst.insert(40);
        bst.insert(15);
        bst.insert(50);
        bst.insert(5);
        bst.insert(30);
        bst.insert(17);
        System.out.println(" === In order traversal ===");
        bst.inorder(bst.root);
        System.out.println("=== Search result ===");
        bst.searchKey(10);
        System.out.println("=== Insert/Delete Demo ===");
        bst.delete(100);
        bst.delete(20);
        System.out.println("=== Inorder ===");
        bst.inorder(bst.root);
        System.out.println();
        bst.insert(20);
        bst.delete(30);
        System.out.println("=== Pre order ===");
        bst.preorder(bst.root);
        System.out.println("\n=== Post Order ===");
        bst.postorder(bst.root);

    }
}
