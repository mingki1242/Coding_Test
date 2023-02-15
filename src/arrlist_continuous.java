import java.util.*;

public class arrlist_continuous {
    public int solution (int [] arr , int num)
    {
        int answer=0;
        int sum = 0;
        int lt = 0;
        int rt = 0;
        for(rt = 0 ; rt<arr.length;rt++)
        {
            sum += arr[rt];
            if(sum == num) answer++;
            while(sum>num)
            {
                sum-=arr[lt++];
                if(sum == num) answer++;
            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        arrlist_continuous ac = new arrlist_continuous();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ;i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(ac.solution(arr,num));
    }
}
