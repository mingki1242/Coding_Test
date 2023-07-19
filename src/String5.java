import java.util.*;
public class String5 {
    public String solution(String str)
    {
        String answer = "";
        char [] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt)
        {
            if(Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt]))
            {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            else if(!Character.isAlphabetic(c[rt]))
            {
                rt--;
            }
            else if(!Character.isAlphabetic(c[lt]))
            {
                lt++;
            }

        }
        answer = String.valueOf(c);
        return answer;
    }
    public static void main (String [] argv)
    {
        String5 rv = new String5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(rv.solution(str));
    }


}