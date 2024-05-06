import java.util.Scanner;

public class sorting4 {
    public int[] solution(int ch_size , int [] job_arr)
    {
        int check = 0;
        int tmp=0;
        int [] answer = new int[ch_size];
        for(int i = 0 ;i<job_arr.length;i++)
        {
            check = 0;
            for(int j = 0;j<ch_size;j++)
            {
                if(job_arr[i] == answer[j]) //같은 값이 있을경우
                {
                    tmp = answer[j];
                    for(int k = j ; k>=1;k--)
                    {
                        answer[k] = answer[k-1];
                    }
                    answer[0] = tmp;
                    check = 1;
                }
            }
            if(check == 0)
            {
                for(int j =ch_size-1 ; j>=1;j--)
                {
                    answer[j] = answer[j-1];
                }
                answer[0] = job_arr[i];

            }
            /*for(int x : answer)
            {
                System.out.print(x + " ");
            }
            System.out.println();*/

        }
        return answer;
    }
    public static void main (String [] argv)
    {
        sorting4 s4 = new sorting4();
        Scanner sc = new Scanner(System.in);
        int ch_size = sc.nextInt();
        int job_arr_size = sc.nextInt();
        int [] job_arr = new int[job_arr_size];
        for(int i = 0 ;i<job_arr_size;i++)
        {
            job_arr[i] = sc.nextInt();
        }
        for(int x : s4.solution(ch_size , job_arr))
        {
            System.out.print(x + " ");
        }
    }
}
