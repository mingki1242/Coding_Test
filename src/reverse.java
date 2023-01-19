import java.util.*;
public class reverse {
    public String solution(String str)
    {
        String answer = "";
        char []c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt<rt)
        {
            if(!Character.isAlphabetic(c[lt]))
            {
                lt++;
            }
            else if (!Character.isAlphabetic(c[rt]))
            {
                rt--;
            }
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(c);

        return answer;
    }
    public static void main (String[] argv)
    {
        reverse rv = new reverse();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(rv.solution(str));

    }

}
