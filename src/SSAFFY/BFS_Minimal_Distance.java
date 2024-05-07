package SSAFFY;
import java.util.*;

/*
주어진 트리의 리프노드까지의 가장 짧은 경로를 구하시오
*/
public class BFS_Minimal_Distance {
    Node root;
    public int solution(Node root)
    {
        int L = 0;
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty())
        {
            int len = Q.size();
            for(int i = 0 ; i<len;i++)
            {
                Node cur = Q.poll();
                if(cur.lt == null || cur.rt ==null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String [] argv)
    {
        BFS_Minimal_Distance tree = new BFS_Minimal_Distance();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.solution(tree.root));
    }

}
