import java.util.*;
public class Long_Char {
    public String solution(String str)
    {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s)
        {
            int len = x.length();
            if(len > m)
            {
                m=len;
                answer = x;
            }
        }
        return answer;
    }


    public static void main (String [] argv)
    {
        Long_Char long_char = new Long_Char();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(long_char.solution(str));

    }
}
