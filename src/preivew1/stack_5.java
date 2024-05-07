import java.util.*;

public class stack_5 {
    public int solution(String str)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ;i<str.length();i++)
        {
            if(str.charAt(i)=='(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1)=='(') answer+=stack.size();
                else answer++;
            }
        }
        return answer;
    }


    public static void main(String []argv)
    {
        stack_5 st5 = new stack_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(st5.solution(str));
    }

}
