import java.util.*;
public class String10
{
    public int [] solution (String str , char c)
    {
        int [] answer = new int[str.length()];
        char [] x = str.toCharArray();
        int distance = 1000;
        for(int i = 0 ; i<str.length();i++)
        {
            if(x[i] == c)
            {
                distance = 0;
                answer[i] = distance;
            }
            else {
                distance++;
                answer[i] = distance;
            }
        }
        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            if(x[i] == c)
            {
                distance = 0;
                answer[i] = distance;
            }
            else {
                distance++;
                if(distance < answer[i])
                {
                    answer[i] = distance;
                }
            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        String10 bd = new String10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : bd.solution(str,c))
        {
            System.out.print(x + " ");
        }

    }
}