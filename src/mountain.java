import java.util.*;
public class mountain {
    public int solution(int num , int [][] arr)
    {
        int answer = 0;
        int Big_Num = 0;

        for(int i = 1 ; i<=num ; i++)
        {
            for(int j = 1 ; j <= num ; j++)
            {
                Big_Num = arr[i][j];
                if(Big_Num > arr[i-1][j] && Big_Num >arr[i][j+1] && Big_Num > arr[i+1][j] && Big_Num > arr[i][j-1])
                {
                    answer+=1;
                }

            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        mountain mt = new mountain();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][]arr = new int[num+2][num+2];
        for(int i = 1 ; i<=num;i++)
        {
            for(int j = 1 ; j<=num;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<num+2;i++)
        {
            arr[0][i] = 0;
            arr[i][0] = 0;
            arr[num+1][i] = 0;
            arr[i][num+1] = 0;
        }


        System.out.print(mt.solution(num , arr));
    }

}
