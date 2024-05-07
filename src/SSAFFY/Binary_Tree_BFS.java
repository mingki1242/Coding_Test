package SSAFFY;

import java.util.LinkedList;
import java.util.Queue;

//이진 트리를 너비 우선으로 탐색해서 출력하는 방법
public class Binary_Tree_BFS {
    Node root;
    public void BFS(Node root)
    {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty())
        {
            System.out.print(L + " : ");
            for(int i = 0 ; i<Q.size() ; i++)
            {
                Node cur = Q.poll();
                System.out.print(cur.val+ " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            System.out.println();
            L++;
        }
    }


    public static void main (String [] argv)
    {

        Binary_Tree_BFS tree = new Binary_Tree_BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }

}
