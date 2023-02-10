import java.util.*;

public class ranking {
    public int [] solution (int num , int[]arr)
    {
        int[] answer = new int[num];
        int rank = 1;
        int target = 0;
        for(int i = 0 ; i<num;i++)
        {
            rank = 1;
            target = arr[i];
            for(int j = 0 ; j<num;j++)
            {
                if(target < arr[j])
                {
                    rank++;
                }

            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main (String [] argv)
    {
        ranking rk = new ranking();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i = 0 ;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int x : rk.solution(num,arr))
        {
            System.out.print(x + " ");
        }

    }

}
