import java.util.*;
public class press {
    public String solution(String str)
    {
        String answer = "";
        str += " ";
        int num = 1;
        for(int i = 0 ; i<str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                num++;
            }
            else {

                if(num>1)
                {
                    answer+=str.charAt(i);
                    answer+=String.valueOf(num);
                    num = 1;
                }
            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        press pr = new press();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(pr.solution(str));
    }
}
