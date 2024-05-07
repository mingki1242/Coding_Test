package SSAFFY;
//이진 트리 순회(DFS)
//전위 순회(preorder) , 중위 순회(inorder) , 후위 순회(postorder)를 각각 출력하는 문제
class Node
{
    int val;
    Node lt , rt;
    Node(int input)
    {
        val = input;
        lt = rt = null;
    }
}

class Binary_Tree_DFS{
    Node root;
    public void preorder_DFS(Node root)
    {
        if(root == null) return;
        else{
            System.out.print(root.val + " ");
            preorder_DFS(root.lt);
            preorder_DFS(root.rt);
        }
    }

    public void inorder_DFS(Node root)
    {
        if(root == null) return;
        else{
            inorder_DFS(root.lt);
            System.out.print(root.val + " ");
            inorder_DFS(root.rt);
        }
    }

    public void postorder_DFS(Node root)
    {
        if(root == null) return;
        else{
            postorder_DFS(root.lt);
            postorder_DFS(root.rt);
            System.out.print(root.val + " ");
        }
    }
    public static void main (String [] argv)
    {
        Binary_Tree_DFS tree = new Binary_Tree_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        System.out.print("전위 순회 : ");
        tree.preorder_DFS(tree.root);
        System.out.println();

        System.out.print("중위 순회 : ");
        tree.inorder_DFS(tree.root);
        System.out.println();

        System.out.print("후위 순회 : ");
        tree.postorder_DFS(tree.root);
        System.out.println();
    }
}
































