import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * InOrder
 */
public class InOrder {
    static{
        System.out.println("In Order");
    }
    
    void recursiveTra(Node root){
        if(root == null) return;
        recursiveTra(root.left);
        System.out.print(root.value+", ");
        recursiveTra(root.right);
    }

    List<Integer> iterativeTra(Node root){
        if(root == null) return null;
        List<Integer> res = new ArrayList<>();
        Stack<Node> store = new Stack<>();
        Node currentNode = root;
        while( currentNode != null || !store.isEmpty() ){
            if(currentNode != null){
                store.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = store.pop();
            res.add(currentNode.value);
            System.out.print(currentNode.value+", ");
            currentNode = currentNode.right;
        }
        return res;
    }
}

