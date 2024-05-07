package SSAFFY;

//자연수 n이 주어지면 1부터 n까지의 수를 원소로 갖는 집합의 부분집합을 모두 출력하는 문제
public class DFS_Subset {
    static int n;
    static int [] ch;
    public void DFS(int L)
    {
        if(L == n+1){
            for(int i = 0 ; i<ch.length ; i++)
            {
                if(ch[i] == 1)
                {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }
    public static void main (String [] argv)
    {
        DFS_Subset DFS_subset = new DFS_Subset();
        n = 10;
        ch = new int[n+1];
        DFS_subset.DFS(1);
    }
}
