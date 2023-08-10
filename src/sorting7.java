import java.util.*;

public class sorting7 {
    public int [][] solution(int size , int [][] board)
    {
        int[][]answer = new int[size][size];
        int max = board[0][0];
        for(int i = 0 ;i<2;i++)
        {
            for(int j = 0 ; j<size;j++)
            {
                if(board[j][i] < max)
                {
                    int tmp = board[j][i];

                }
            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        sorting7 s7 = new sorting7();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] board = new int[size][size];
        for(int i = 0 ;i<2;i++)
        {
            for(int j = 0 ; j<size;j++)
            {
                board[j][i] = sc.nextInt();
            }
        }

        for(int i = 0;i<2;i++)
        {
            for(int j = 0 ; j<size;j++)
            {
                System.out.print(s7.solution(size,board) + " ");
            }
            System.out.println();
        }

    }
}
