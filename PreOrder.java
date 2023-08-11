import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PreOrder{
    static{
        System.out.println("Pre Order");
    }

    void recursiveTra(Node root){
        if(root == null) return;
        System.out.print(root.value+", ");
        recursiveTra(root.left);
        recursiveTra(root.right);
    }

    List<Integer> iterativeTra(Node root){
        if(root == null) return null;
        List<Integer> res = new ArrayList<>();
        Stack<Node> store = new Stack<>();
        store.push(root);
        while(!store.isEmpty()){
            root = store.pop();
            res.add(root.value);
            System.out.print(root.value+", ");
            if(root.right != null) store.push(root.right);
            if(root.left != null) store.push(root.left);
        }
        return res;
    }
}