import java.util.*;


public class stack_4 {
    public int solution(String str)
    {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(Character.isDigit(c)) stack.push(c-48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt+rt);
                else if(c == '-') stack.push(lt-rt);
                else if(c == '*') stack.push(lt*rt);
                else if(c == '/') stack.push(lt/rt);
            }
        }
        answer= stack.get(0);
        return answer;
    }
    public static void main(String []argv)
    {
        stack_4 st2 = new stack_4();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(st2.solution(str));
    }

}
