import java.util.*;


public class stack_2 {
    public String solution(String str)
    {
        String answer = " ";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(c == ')')
            {
                while(stack.pop()!='(');
            }
            else stack.push(c);
        }
        for(int i = 0 ; i<stack.size();i++)
        {
            answer+=stack.get(i);
        }
        return answer;
    }
    public static void main(String []argv)
    {
        stack_2 st2 = new stack_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(st2.solution(str));
    }

}
