import java.util.Scanner;

public class natual_num_sum {
    public int solution (int num)
    {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int sum = 0;
        int [] arr = new int[num/2+1];
        for(int i = 0 ;i<arr.length;i++)
        {
            arr[i] = i+1;
        }
        for(rt = 0 ; rt<arr.length;rt++)
        {
            sum+=arr[rt];
            if(sum == num) answer++;
            while(sum > num)
            {
                sum -= arr[lt++];
                if(sum ==num) answer++;
            }
        }
        return answer;
    }



    public static void main(String [] argv)
    {
        natual_num_sum nns = new natual_num_sum();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(nns.solution(num));
    }
}
