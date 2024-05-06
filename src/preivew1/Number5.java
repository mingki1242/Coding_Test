import java.util.*;
public class Number5 {
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
        Number5 ss = new Number5();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(ss.solution(num));


    }
}
