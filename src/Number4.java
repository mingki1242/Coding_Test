import java.util.*;

public class Number4 {
    public int [] solution(int num)
    {
        int [] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2 ; i<num;i++)
        {
            answer[i] = answer[i-1] + answer[i-2];

        }
        return answer;
    }
    public static void main (String [] argv)
    {
        Number4 fi = new Number4();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int x : fi.solution(num))
        {
            System.out.print(x + " ");
        }
    }
}
