import java.util.*;
public class stack_1 {
    public String solution(String str)
    {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(c=='(') stack.push(c);
            else
            {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String [] argv)
    {
        stack_1 st1 = new stack_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(st1.solution(str));
    }
}
