/**
 * PostOrder
 */
public class PostOrder {
    static{
        System.out.println("Post Order");
    }
    
    void recursiveTra(Node root){
        if(root == null) return;
        recursiveTra(root.left);
        recursiveTra(root.right);
        System.out.print(root.value+", ");
    }
    
}