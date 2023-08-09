public class Main {
    public static void main(String[] args) {
        // build tree
        Node tree1 = new Node(5);
        tree1.left= new Node(3);
        tree1.right= new Node(7);
        // System.out.println(tree1);
        // System.out.println(tree1.value);
        // test pre order
        PreOrder preO = new PreOrder();
        preO.recursiveTra(tree1);
        preO.recursiveTra(tree1);
    }
}
