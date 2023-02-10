import java.util.*;
public class sosu {
    public int solution(int num)
    {
        int answer = 0;
        int [] arr = new int[num + 1];
        for(int i = 2 ; i<=num ; i++)
        {
           if(arr[i]==0)
           {
               answer++;
               for(int j = i ; j <= num ; j = j + i) arr[j]=1;
           }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        sosu ss = new sosu();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(ss.solution(num));


    }
}
