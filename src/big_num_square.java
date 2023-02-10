import java.util.*;
public class big_num_square {
    public int solution(int num , int[][]arr)
    {
        int answer = 0;
        int Big_Num = 0;
        int tmp = 0;

        //가로 최대합 구하기
        for(int i = 0 ; i<num;i++)
        {
            for(int j = 0 ; j<num;j++)
            {
                tmp+=arr[i][j];
            }
            if(Big_Num < tmp)
            {
                Big_Num = tmp;
                tmp=0;
            }
            else tmp = 0;
        }

        //세로 최대합 구하기
        for(int i = 0 ; i<num;i++)
        {
            for(int j = 0 ; j<num;j++)
            {
                tmp+=arr[j][i];
            }
            if(Big_Num < tmp)
            {
                Big_Num = tmp;
                tmp=0;
            }
            else tmp = 0;
        }

        //오른쪽 아래 대각선 최대합 구하기
        for(int i = 0 ; i<num;i++)
        {
            for(int j = 0 ; j<num;j++)
            {
                tmp+=arr[j][j];
            }

            if(Big_Num < tmp)
            {
                Big_Num = tmp;
                tmp=0;
            }
            else tmp = 0;
        }
        //왼쪽아래 대각선
        for(int i = num-1 ; i>=0;i--)
        {
            for(int j = 0 ; j<num;j++)
            {
                tmp+=arr[i][j];
            }

            if(Big_Num < tmp)
            {
                Big_Num = tmp;
                tmp=0;
            }
            else tmp = 0;
        }

        answer = Big_Num;
        return answer;
    }

    public static void main (String []argv)
    {
        big_num_square bns = new big_num_square();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][]arr = new int[num][num];
        for(int i = 0 ; i<num;i++)
        {
            for(int j = 0 ; j<num;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(bns.solution(num , arr));

    }

}
