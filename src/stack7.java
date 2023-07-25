import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stack7 {
    public String solution(String str1 , String str2)
    {
        String answer = "YES";
        Queue<Character> q1 = new LinkedList<>();
        for(char c : str1.toCharArray())
        {
            q1.offer(c);
        }
        for(char x : str2.toCharArray())
        {
            if(q1.contains(x))
            {
                if(q1.peek() == x)
                {
                    q1.poll();
                }
                else return "NO";
            }
        }
        if(!q1.isEmpty()) return "NO";
        return answer;
    }

    public static void main (String [] argv)
    {
        stack7 s7 = new stack7();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(s7.solution(str1 , str2));
    }
}
