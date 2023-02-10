import java.util.*;
public class mentoring {
    public int solution(int horizon , int vertical , int[][]arr)
    {
        int answer = 0;

        return answer;
    }
    public static void main (String[]argv)
    {
        Scanner sc = new Scanner(System.in);
        int horizon = sc.nextInt();
        int vertical = sc.nextInt();
        int [][]arr = new int[horizon][vertical];
        for(int i = 0 ; i<horizon;i++)
        {
            for(int j = 0 ; j<vertical;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

    }

}
