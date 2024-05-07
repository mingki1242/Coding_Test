package SSAFFY;

/*현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.

현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.

송아지는 움직이지 않고 제자리에 있다.

현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.

최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

첫번째 값은 현수의 위치 두번째 값은 송아지의 위치

ex) 입력값 : 5 14 , 출력값 : 3
*/

import java.util.*;
public class BFS_Cow {
    public int solution(int root , int Target_Position)
    {
        int L=0;
        int [] ch = new int[10001];
        Queue<Integer> Q = new LinkedList<>();
        int [] move = {1 , -1 , 5};
        Q.offer(root);
        ch[root] = 1;
        while(!Q.isEmpty())
        {
            int len = Q.size();
            for(int i = 0 ; i < len;i++)
            {
                int cur = Q.poll();
                if(cur == Target_Position) return L;
                for(int j = 0 ; j<3;j++)
                {
                    int nx = cur + move[j];
                    if(ch[nx] != 1 && nx >=1 && nx<=10000)
                    {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main (String [] argv)
    {
        BFS_Cow BFS_Cow = new BFS_Cow();
        Scanner sc = new Scanner(System.in);
        int Chul_Position = sc.nextInt();
        int Cow_Position = sc.nextInt();
        System.out.println(BFS_Cow.solution(Chul_Position , Cow_Position));
    }


}
