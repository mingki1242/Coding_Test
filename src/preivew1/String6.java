import java.util.*;

public class String6 {
    public String solution (String str){
        String answer = "";

        for(int i = 0 ; i<str.length();i++)
        {
            if(i == str.indexOf(str.charAt(i)))
            {
                answer+= str.charAt(i);
            }

        }
        return answer;
    }
    public static void main (String[] argv)
    {
        String6 dt = new String6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(dt.solution(str));
    }



}
