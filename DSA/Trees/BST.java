class BSTNode {
    int key;
    BSTNode left, right;
    BSTNode(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    BSTNode root;

    BSTNode insert(BSTNode node, int key) {
        if (node == null) return new BSTNode(key);
        if (key < node.key) node.left = insert(node.left, key);
        else node.right = insert(node.right, key);
        return node;
    }

    void inorder(BSTNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.inorder(tree.root);
    }
}