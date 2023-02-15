import java.util.*;
public class sold_money {
    public int solution(int [] arr , int num)
    {
        int answer = 0;
        int sum = 0;
        for(int i = 0 ; i<num ; i++)
        {
            sum+=arr[i];
        }
        answer = sum;

        for(int i = num ; i<arr.length;i++)
        {
            sum+=(arr[i] - arr[i-num]);
            answer = Math.max(answer,sum);
        }
        return answer;
    }

    public static void main(String []argv)
    {
        sold_money sm = new sold_money();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int []arr = new int[num];
        for(int i = 0 ; i< num ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(sm.solution(arr , num2));
    }
}
