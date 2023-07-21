import java.util.*;

public class Array4 {
    public int solution (int [] arr , int num)
    {
        int answer=0;
        int sum = 0;
        int lt = 0;
        for(int rt = 0 ; rt<arr.length;rt++)
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
        Array4 ac = new Array4();
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
