import java.util.*;
public class String2 {
    public String solution(String str)
    {
        String answer = "";
        for(char c : str.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                answer += Character.toUpperCase(c);
            }
            else answer += Character.toLowerCase(c);
        }
        return answer;
    }
    public static void main(String[] argv)
    {
        String2 find_upper = new String2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(find_upper.solution(str));
    }




}
