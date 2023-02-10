import java.util.*;
public class mentoring {
    public int solution(int horizon , int vertical , int[][]arr)
    {
        int pi = 0 ;
        int pj = 0;
        int count = 0;
        int answer = 0;
        for(int i = 1 ; i<=vertical;i++)
        {
            for(int j = 1 ; j<=vertical;j++)
            {
                count = 0;
                for(int k = 0 ; k<horizon;k++)
                {
                    for(int t = 0 ; t<vertical;t++)
                    {
                        if(arr[k][t]==i)
                        {
                            pi = t;
                        }
                        if(arr[k][t]==j)
                        {
                            pj = t;
                        }
                    }
                    if(pi<pj) count++;

                }
                if(count == horizon) answer++;
            }
        }
        return answer;
    }
    public static void main (String[]argv)
    {
        mentoring mt = new mentoring();
        Scanner sc = new Scanner(System.in);
        int vertical = sc.nextInt();
        int horizon = sc.nextInt();
        int [][]arr = new int[horizon][vertical];
        for(int i = 0 ; i<horizon;i++)
        {
            for(int j = 0 ; j<vertical;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(mt.solution(horizon , vertical , arr));
    }

}
