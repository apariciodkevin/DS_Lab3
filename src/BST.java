import java.util.IllegalFormatCodePointException;

public class BST {
    class Node {
        int key;
        Node left;
        Node right;

        Node (int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public void insert (int key){
        Node temp = this.root;

        if (root == null){
            root = new Node(key);
        } else {
            while (true){
                if (temp.key > key){
                    if (temp.left == null){
                        temp.left = new Node(key);
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null){
                        temp.right = new Node(key);
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public void inorder (Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    public Node searchKey (int key){
        Node temp = this.root;
        for (;;){
            if (temp == null){
                System.out.println("Key " + key + " does not exist.");
                return null;
            }
            if (temp.key == key){
                System.out.println("Key " + key + " Found!");
                return temp;
            }
            if (temp.key > key){
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
    }

    public void preorder (Node root){
        if (root == null){
            return;
        }
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder (Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");

    }

    public Node delete (Node root, int key){
        Node temp = this.root;
        Node parent = null;
        for (;;){
            if (temp == null){
                return null;
            }
            if (temp.key == key){
                if (temp.left == null && temp.right == null){

                }
            }
            if (temp.key > key){
                parent = temp;
                temp = temp.left;
            } else {
                parent = temp;
                temp = temp.right;
            }
        }

    }
}
