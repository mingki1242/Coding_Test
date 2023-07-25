import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stack6 {
    public int solution(int num1 , int num2)
    {
        int check = 0;
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i <num1;i++) {
            q.offer(i+1);
        }
        while(q.size() > 1)
        {
            for(int i = 0 ; i<num2-1 ;i++)
            {
                q.offer(q.poll());
            }
            q.poll();
        }
        answer = q.poll();
        return answer;
    }

    public static void main (String [] argv)
    {
        stack6 s6 = new stack6();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(s6.solution(num1 , num2));
    }
}
